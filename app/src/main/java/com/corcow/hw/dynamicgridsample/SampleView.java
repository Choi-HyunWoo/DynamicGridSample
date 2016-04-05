package com.corcow.hw.dynamicgridsample;

import android.content.Context;
import android.widget.FrameLayout;

/**
 * Created by multimedia on 2016-04-04.
 */
public class SampleView extends FrameLayout {


    public SampleView(Context context) {
        super(context);
        init();
    }

    public void init() {
        inflate(getContext(), R.layout.sample_view, this);
    }
}
