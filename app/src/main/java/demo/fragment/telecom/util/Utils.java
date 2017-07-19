package demo.fragment.telecom.util;

import android.util.Log;

import demo.fragment.telecom.BuildConfig;

/**
 * Created by Dong on 2017/7/19 0019.
 */

public class Utils {

    public static final boolean isDEBUG = BuildConfig.DEBUG;

    public static void logd(String tag, String msg) {
        if (isDEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void loge(String tag, String msg) {
        if (isDEBUG) {
            Log.e(tag, msg);
        }
    }
}
