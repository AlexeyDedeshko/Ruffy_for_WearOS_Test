package org.monkey.d.ruffy.ruffy.view;

import android.content.Context;
import android.graphics.Canvas; // Импорт класса Canvas
import android.util.AttributeSet;
import android.view.View;

public class PumpDisplayView extends View {

    public PumpDisplayView(Context context) {
        super(context);
        init();
    }

    public PumpDisplayView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PumpDisplayView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        // Инициализация компонента
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        // Измерение размеров компонента
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // Отрисовка компонента
    }
}