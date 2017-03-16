package com.example.lizejun.repoimagelearn;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;

public class DensityTool {

    public static void logDensityInfo(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        //将信息保存到displayMetrics中.
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        //1.x轴和y轴的dpi.
        Log.d("logDensityInfo", "ydpi=" + displayMetrics.ydpi);
        Log.d("logDensityInfo", "xdpi=" + displayMetrics.xdpi);
        //2.x轴和y轴的像素个数.
        Log.d("logDensityInfo", "heightPixels=" + displayMetrics.heightPixels);
        Log.d("logDensityInfo", "widthPixels=" + displayMetrics.widthPixels);
        //3.dpi
        Log.d("logDensityInfo", "densityDpi=" + displayMetrics.densityDpi);
        //4.dpi/160.
        Log.d("logDensityInfo", "density=" + displayMetrics.density);
        //5.通常情况下和density相同.
        Log.d("logDensityInfo", "scaledDensity=" + displayMetrics.scaledDensity);
    }
}
