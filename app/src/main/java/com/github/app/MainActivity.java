package com.github.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.github.flipzeus.FlipDirection;
import com.github.flipzeus.ImageFlipper;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView vImage = (ImageView) findViewById(R.id.vertical);
        ImageFlipper.flip(vImage, FlipDirection.VERTICAL);

        ImageView hImage = (ImageView) findViewById(R.id.horizontal);
        ImageFlipper.flip(hImage, FlipDirection.HORIZONTAL);
    }
}
