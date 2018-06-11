package com.example.yamuna.locationtracking;

import android.content.Context;

/**
 * Created by Yamuna on 6/11/2018.
 */

final class DimentionUtils {

    private DimentionUtils() {
    }

    static float converPixelsToSp(float px, Context context) {
        return px / context.getResources().getDisplayMetrics().scaledDensity;
    }
}
