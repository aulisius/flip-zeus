package com.github.flipzeus;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class ImageFlipper {

    public static void flip(ImageView imageView, FlipDirection flipDirection) {
        Drawable drawable = flip(imageView.getDrawable(), flipDirection);
        imageView.setImageDrawable(drawable);
    }

    public static Drawable flip(Drawable drawable, FlipDirection flipDirection) {
        if (drawable == null) {
            return null;
        }
        Bitmap in = ((BitmapDrawable) drawable).getBitmap();
        return new BitmapDrawable(Resources.getSystem(), flip(in, flipDirection));
    }

    public static Bitmap flip(Bitmap input, FlipDirection flipDirection) {
        Bitmap output = null;
        switch (flipDirection) {
            case VERTICAL:
                output =  flipVertical(input);
                break;
            case HORIZONTAL:
                output = flipHorizontal(input);
        }
        return output;
    }

    private static Bitmap flipVertical(Bitmap input) {
        Matrix matrix = new Matrix();
        matrix.postScale(1, -1, input.getWidth()/2, input.getHeight()/2);
        return Bitmap.createBitmap(
                input,
                0,
                0,
                input.getWidth(),
                input.getHeight(),
                matrix,
                false
        );
    }

    private static Bitmap flipHorizontal(Bitmap input) {
        Matrix matrix = new Matrix();
        matrix.postScale(-1, 1, input.getWidth()/2, input.getHeight()/2);
        return Bitmap.createBitmap(
                input,
                0,
                0,
                input.getWidth(),
                input.getHeight(),
                matrix,
                false
        );
    }

}
