package com.example.com.w4d3homeworkmvp.Login;

/**
 * Created by raul on 09/11/2016.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
