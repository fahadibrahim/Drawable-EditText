package com.fib.drawable_edittext;

/**
 * Created by fibrahim on 1/29/18.
 */

public interface DrawableClickListener {

    public static enum DrawablePosition { TOP, BOTTOM, LEFT, RIGHT };
    public void onClick(DrawablePosition target);
}