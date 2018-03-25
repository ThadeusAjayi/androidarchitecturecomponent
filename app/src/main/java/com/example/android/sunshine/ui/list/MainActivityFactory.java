package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.ui.detail.DetailActivityViewModel;

import java.util.Date;

/**
 * Created by Thadeus-APMIS on 3/25/2018.
 */

public class MainActivityFactory extends ViewModelProvider.NewInstanceFactory {

    private final SunshineRepository mRepository;
    private Date date;

    public MainActivityFactory(SunshineRepository repository) {
        this.mRepository = repository;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new MainActivityViewModel(mRepository);
    }
}
