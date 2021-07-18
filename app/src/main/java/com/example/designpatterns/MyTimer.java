package com.example.designpatterns;

import android.app.Activity;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer extends ViewModel {

    private Activity activity;
    private final Timer timer;
//    protected MutableLiveData<Boolean> endLoading = new MutableLiveData<Boolean>();
    protected MutableLiveData<String> timerText = new MutableLiveData<String>();
    private TimerTask timerTask;
    private Double    time = 0.0;
//    private boolean timerStarted = false;

    public MyTimer(Activity activity) {
        this.timer = new Timer();
        this.activity = activity;
    }

    public void resetTime() {
        if(timerTask != null)
        {
            timerTask.cancel();
            time = 0.0;
        }
    }

    protected void stop() {
        timerTask.cancel();
    }

    public void startTimer()
    {
        timerTask = new TimerTask() {

            @Override
            public boolean cancel() {
                return super.cancel();
            }

            @Override
            public void run()
            {
                activity.runOnUiThread(() -> {
                    time++;
                    timerText.setValue(getTimerText());
                });
            }
        };
        timer.scheduleAtFixedRate(timerTask, 0 ,1000);
    }


    public String getTimerText() {
        int rounded = (int) Math.round(time);

        int seconds = ((rounded % 86400) % 3600) % 60;
        int minutes = ((rounded % 86400) % 3600) / 60;
        int hours = ((rounded % 86400) / 3600);

        return formatTime(seconds, minutes, hours);
    }

    private String formatTime(int seconds, int minutes, int hours) {
        return String.format("%02d",hours) + " : " + String.format("%02d",minutes) + " : " + String.format("%02d",seconds);
    }

}
