package com.github.flipzeus;

import android.graphics.Bitmap;

public class ImageFlipper {

    public static Bitmap flip(Bitmap input, FlipDirection flipDirection) {
        Bitmap output = null;
        switch (flipDirection) {
            case Vertical:
                output =  flipVertical(input);
                break;
            case Horizontal:
                output = flipHorizontal(input);
        }
        return output;
    }

    private static Bitmap flipVertical(Bitmap input) {
        return input;
    }

    private static Bitmap flipHorizontal(Bitmap input) {
        return input;
    }

}
