package com.example.luo.dans;


import android.app.Activity;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @ViewById
    TextView titleTextView;

    @AfterViews
    void initUI(){
        titleTextView.append("this is MainActivity");
    }

}
