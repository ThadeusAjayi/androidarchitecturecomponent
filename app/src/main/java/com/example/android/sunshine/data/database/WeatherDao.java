package com.example.android.sunshine.data.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.Date;
import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by Thadeus-APMIS on 3/24/2018.
 */
@Dao
public interface WeatherDao {

    @Query("SELECT * FROM weather")
    List<WeatherEntry> getAll();

    @Query("SELECT * FROM weather WHERE date = :date")
    WeatherEntry getWeatherByDate(Date date);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(WeatherEntry... weatherEntries);

    @Delete
    void delete(WeatherEntry weatherEntry);


}
