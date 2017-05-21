package com.github.app;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.github.flipzeus.FlipDirection;
import com.github.flipzeus.ImageFlipper;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.image);

        Bitmap in = ((BitmapDrawable)imageView.getDrawable()).getBitmap();
        Bitmap vertical = ImageFlipper.flip(in, FlipDirection.VERTICAL);
        Bitmap horizontal = ImageFlipper.flip(in, FlipDirection.HORIZONTAL);

        ImageView vImage = (ImageView) findViewById(R.id.vertical);
        vImage.setImageBitmap(vertical);

        ImageView hImage = (ImageView) findViewById(R.id.horizontal);
        hImage.setImageBitmap(horizontal);
    }
}
