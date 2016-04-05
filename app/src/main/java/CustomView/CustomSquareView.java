package CustomView;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Kazi Md. Saidul Email: kazimdsaidul@gmail.com on 4/5/2016.
 */
public class CustomSquareView extends View {
    public CustomSquareView(Context context) {
        super(context);
    }

    public CustomSquareView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomSquareView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomSquareView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(min, min);

    }
}
