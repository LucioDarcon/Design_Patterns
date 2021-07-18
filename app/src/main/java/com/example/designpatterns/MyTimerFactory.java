package com.example.designpatterns;

import android.app.Activity;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class MyTimerFactory extends ViewModelProvider.NewInstanceFactory {

    @NonNull
    private final Activity activity;

    public MyTimerFactory(@NonNull Activity activity) {
        this.activity = activity;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass == MyTimer.class) {
            return (T) new MyTimer(activity);
        }
        return null;
    }

}
