package com.my.mtaj_11.myrecipe.CustomViews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by MTAJ-08 on 10/27/2016.
 */
public class MyCustomTextView1 extends TextView {

    public MyCustomTextView1(Context context, AttributeSet attrs)
    {
        super(context,attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/lobster.otf"));
    }

}
