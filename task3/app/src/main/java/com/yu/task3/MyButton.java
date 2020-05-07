package com.yu.task3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MyButton extends androidx.appcompat.widget.AppCompatButton {


    public MyButton(Context context) {
        super(context);
        setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    v.animate().scaleXBy(100f).setDuration(5000).start();
                    v.animate().scaleYBy(100f).setDuration(5000).start();
                    return true;
                } else if (action == MotionEvent.ACTION_UP) {
                    v.animate().cancel();
                    v.animate().scaleX(1f).setDuration(1000).start();
                    v.animate().scaleY(1f).setDuration(1000).start();
                    return true;
                }
                return false;
            }
        });
    }
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    v.animate().scaleXBy(100f).setDuration(5000).start();
                    v.animate().scaleYBy(100f).setDuration(5000).start();
                    return true;
                } else if (action == MotionEvent.ACTION_UP) {
                    v.animate().cancel();
                    v.animate().scaleX(1f).setDuration(1000).start();
                    v.animate().scaleY(1f).setDuration(1000).start();
                    return true;
                }
                return false;
            }
        });
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    v.animate().scaleXBy(100f).setDuration(5000).start();
                    v.animate().scaleYBy(100f).setDuration(5000).start();
                    return true;
                } else if (action == MotionEvent.ACTION_UP) {
                    v.animate().cancel();
                    v.animate().scaleX(1f).setDuration(1000).start();
                    v.animate().scaleY(1f).setDuration(1000).start();
                    return true;
                }
                return false;
            }
        });
    }
}
