package com.example.movieapp.adapter;


import com.example.movieapp.model.ShowSearchDetails;

public interface IShowClickListner
{
    void onShowClick(ShowSearchDetails showDetails);
    void onSaveBookMark(ShowSearchDetails showDetails);
    void onDeleteBookMark(ShowSearchDetails showDetails);
}
