package com.example.com.w4d3homeworkmvp.main;

import java.util.List;

/**
 * Created by raul on 09/11/2016.
 */

public interface FindItemsInteractor {
    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener listener);
}
