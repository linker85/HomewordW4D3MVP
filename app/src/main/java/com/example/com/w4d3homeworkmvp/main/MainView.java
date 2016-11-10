package com.example.com.w4d3homeworkmvp.main;

import java.util.List;

/**
 * Created by raul on 09/11/2016.
 */

public interface MainView {
    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
