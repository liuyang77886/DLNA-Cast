package com.neulion.android.demo.player;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;

/**
 * User: liuwei(wei.liu@neulion.com.com)
 * Date: 2018-07-16
 * Time: 11:28
 */
public class CastButtonFactory
{
    public static Button newCastButton(Context context, ViewGroup viewGroup)
    {
        Button button = new Button(context);

        button.setText("Cast");

        button.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

        return button;
    }
}