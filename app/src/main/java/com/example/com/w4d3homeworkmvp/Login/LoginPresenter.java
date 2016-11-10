package com.example.com.w4d3homeworkmvp.Login;

/**
 * Created by raul on 09/11/2016.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
