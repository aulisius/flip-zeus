package com.github.flipzeus;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class ImageFlipper {

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
        matrix.postScale(-1,1,input.getWidth()/2,input.getHeight()/2);
        return Bitmap.createBitmap(input,0,0,input.getWidth(),input.getHeight(),matrix,false);
    }

}
