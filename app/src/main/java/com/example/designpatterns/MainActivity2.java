package com.example.designpatterns;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    private MyTimer myTimer;

//    TextView timerText;
//    Button stopStartButton;
//
//    Timer timer;
//    TimerTask timerTask;
//    Double time = 0.0;
//    Button buttonReset;
//    boolean timerStarted = false;
//    Button buttonStartStopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myTimer = new ViewModelProvider(this,
                new MyTimerFactory(this))
                .get(MyTimer.class);

        // Create the observer which updates the UI.
        final Observer<Boolean> isLoading = new Observer<Boolean>() {
            @Override
            public void onChanged(final Boolean newName) {
                // Update the UI, in this case, a TextView.
                if (!newName) {
                    Toast.makeText(getApplicationContext(), myTimer.timerText.toString(), Toast.LENGTH_LONG).show();
                }
            }
        };


        final Observer<String> timerText = new Observer<String>() {
            @Override
            public void onChanged(final String newTimeText) {
                // Update the UI, in this case, a TextView.
                Toast.makeText(getApplicationContext(), newTimeText.toString(), Toast.LENGTH_LONG).show();
            }
        };

        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
        myTimer.endLoading.observe(this, isLoading);
        myTimer.timerText.observe(this, timerText);

        myTimer.startTimer();


//        myTimer = new MyTimer(this);
//        myTimer.startTimer();
//
//        timerText = (TextView) findViewById(R.id.timerText);
//        stopStartButton = (Button) findViewById(R.id.startStopButton);
//        buttonReset = (Button) findViewById(R.id.buttonReset);
//        buttonStartStopButton = (Button) findViewById(R.id.startStopButton);
//        timerText = (TextView) findViewById(R.id.timerText);
//
//        timer = new Timer();
//
//        buttonReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                resetTapped(v);
//            }
//        });
//
//        buttonStartStopButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startStopTapped(v);
//            }
//        });
        try {
            Thread.sleep(5000);
            myTimer.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }



//    public void resetTapped(View view)
//    {
//        AlertDialog.Builder resetAlert = new AlertDialog.Builder(this);
//        resetAlert.setTitle("Reset Timer");
//        resetAlert.setMessage("Are you sure you want to reset the timer?");
//        resetAlert.setPositiveButton("Reset", new DialogInterface.OnClickListener()
//        {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i)
//            {
//                if(timerTask != null)
//                {
//                    timerTask.cancel();
//                    setButtonUI("START", R.color.AliceBlue);
//                    time = 0.0;
//                    timerStarted = false;
//                    timerText.setText(formatTime(0,0,0));
//
//                }
//            }
//        });
//
//        resetAlert.setNeutralButton("Cancel", new DialogInterface.OnClickListener()
//        {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i)
//            {
//                //do nothing
//            }
//        });
//
//        resetAlert.show();
//
//    }
//
//    public void startStopTapped(View view)
//    {
//        if(timerStarted == false)
//        {
//            timerStarted = true;
//            setButtonUI("STOP", R.color.colorPrimary);
//
//            startTimer();
//        }
//        else
//        {
//            timerStarted = false;
//            setButtonUI("START", R.color.colorPrimaryDark);
//
//            timerTask.cancel();
//        }
//    }
//
//    private void setButtonUI(String start, int color)
//    {
//        stopStartButton.setText(start);
//        stopStartButton.setTextColor(ContextCompat.getColor(this, color));
//    }
//
//    private void startTimer()
//    {
//        timerTask = new TimerTask()
//        {
//            @Override
//            public void run()
//            {
//                runOnUiThread(new Runnable()
//                {
//                    @Override
//                    public void run()
//                    {
//                        time++;
//                        timerText.setText(getTimerText());
//                    }
//                });
//            }
//
//        };
//        timer.scheduleAtFixedRate(timerTask, 0 ,1000);
//    }
//
//
//    private String getTimerText()
//    {
//        int rounded = (int) Math.round(time);
//
//        int seconds = ((rounded % 86400) % 3600) % 60;
//        int minutes = ((rounded % 86400) % 3600) / 60;
//        int hours = ((rounded % 86400) / 3600);
//
//        return formatTime(seconds, minutes, hours);
//    }
//
//    private String formatTime(int seconds, int minutes, int hours)
//    {
//        return String.format("%02d",hours) + " : " + String.format("%02d",minutes) + " : " + String.format("%02d",seconds);
//    }

}