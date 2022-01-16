package com.example.murdermystery;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * TODO: document your custom view class.
 */
public class Canvas1 extends View {

    private final int paintColor = Color.BLACK;
    private Paint drawPaint;
    float[][] rectangles = {};
    ArrayList<CorrectRectangle> adapter = new ArrayList<>();
    float pointX;
    float pointY;
    float startX;
    float startY;

    public Canvas1(Context context, AttributeSet attr) {
        super(context, attr);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setupPaint();
    }

    private void setupPaint() {
        drawPaint = new Paint();
        drawPaint.setColor(paintColor);
        drawPaint.setAntiAlias(true);
        drawPaint.setStrokeWidth(5);
        drawPaint.setStyle(Paint.Style.STROKE);
        drawPaint.setStrokeJoin(Paint.Join.ROUND);
        drawPaint.setStrokeCap(Paint.Cap.ROUND);
    }
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                final Context context = Canvas1.this.getContext();
                Intent intent = new Intent(context , ArizaDetaylari.class);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        pointX = event.getX();
        pointY = event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startX = pointX;
                startY = pointY;
                return true;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                CorrectRectangle x = new CorrectRectangle(startX, startY, pointX, pointY);
                adapter.add(x);
                break;
            default:
                return false;
        }

        postInvalidate();
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < adapter.size(); i++) {
            canvas.drawRect(adapter.get(i).getP1(), adapter.get(i).getP2(), adapter.get(i).getP3(), adapter.get(i).getP4(), drawPaint);
        }
    }
}