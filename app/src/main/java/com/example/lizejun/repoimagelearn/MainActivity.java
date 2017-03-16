package com.example.lizejun.repoimagelearn;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mWrapImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DensityTool.logDensityInfo(this);
        mWrapImageView = (ImageView) findViewById(R.id.iv_wrap);
        mWrapImageView.post(new Runnable() {
            @Override
            public void run() {
                logWrapperImageView();
            }
        });
    }

    private void logWrapperImageView() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.drawable_test, options);
        Log.d("logWrapperImageView", "width=" + bitmap.getWidth() + ",height=" + bitmap.getHeight() + ",size=" + bitmap.getByteCount() + ",density=" + bitmap.getDensity());
    }
}
