package com.example.murdermystery;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;

/**
 * TODO: document your custom view class.
 */
public class RoomGeneration extends View {
    private final int paintColor = Color.RED;
    private Paint drawPaint;
    private Paint paint2;
    ArrayList<CorrectRectangle> adapter = new ArrayList<>();
    public RoomGeneration(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setupPaint();

    }

    private void setupPaint() {
        drawPaint = new Paint();
        paint2 = new Paint();
        paint2.setTextSize(50);
        paint2.setColor(Color.BLACK);
        drawPaint.setColor(paintColor);
        drawPaint.setAntiAlias(true);
        drawPaint.setStrokeWidth(5);
        drawPaint.setStyle(Paint.Style.STROKE);
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float touchX = event.getX();
        float touchY = event.getY();
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                System.out.println("Touching down!");
                for(int i = 0; i<adapter.size();i++){
                    if(adapter.get(i).getP1()<=touchX && adapter.get(i).getP3()>=touchX
                            && adapter.get(i).getP2()<=touchY && adapter.get(i).getP4()>=touchY){
                        Toast.makeText(getContext(),"touched room "+String.valueOf(i), Toast.LENGTH_SHORT).show();
//                        Intent i = new Intent(<your activity info>);
//                        startActivity(i);
                    }
                }
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("Touching up!");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("Sliding your finger around on the screen.");
                break;
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        CorrectRectangle x = new CorrectRectangle(100,300,400,600);
        CorrectRectangle y = new CorrectRectangle(600,400,800,900);
        adapter.add(x);
        adapter.add(y);
        paint2.setTextAlign(Paint.Align.CENTER);
        for (int i = 0; i < adapter.size(); i++) {
            float midpoint = (adapter.get(i).getP1() + adapter.get(i).getP3())/2;
            float midpoint2 = (adapter.get(i).getP2() + adapter.get(i).getP4())/2;
            canvas.drawRect(adapter.get(i).getP1(), adapter.get(i).getP2(), adapter.get(i).getP3(), adapter.get(i).getP4(), drawPaint);
            canvas.drawText("Room "+String.valueOf(i),midpoint, midpoint2,paint2);
        }
    }
}