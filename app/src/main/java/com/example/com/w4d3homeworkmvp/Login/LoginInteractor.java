package com.example.com.w4d3homeworkmvp.Login;

/**
 * Created by raul on 09/11/2016.
 */

public interface LoginInteractor {
    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
