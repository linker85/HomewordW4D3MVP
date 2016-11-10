package com.example.com.w4d3homeworkmvp.main;

/**
 * Created by raul on 09/11/2016.
 */
public interface MainPresenter {

    void onResume();

    void onItemClicked(int position);

    void onDestroy();
}