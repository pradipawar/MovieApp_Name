package com.example.movieapp.db;



import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.movieapp.model.ShowSearchDetails;

@Database(entities = {ShowSearchDetails.class}, version = 1, exportSchema = false)
public abstract class BookMarkDatabase extends RoomDatabase
{
    public abstract BookmarkDao getDao();
}
