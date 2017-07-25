package com.my.mtaj_11.myrecipe.CustomViews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by MTAJ-11 on 3/29/2017.
 */

public class MyCustomButton extends Button {

    public MyCustomButton(Context context, AttributeSet attrs)
    {
        super(context,attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/josefin_semibold.ttf"));
    }

}