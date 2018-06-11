package com.example.yamuna.locationtracking;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Yamuna on 6/11/2018.
 */

final class TouchUtils {
    private TouchUtils() {
    }

    static boolean isTouchOutsideInitialPosition(MotionEvent event, View view) {
        return event.getX() > view.getX() + view.getWidth();
    }
}
