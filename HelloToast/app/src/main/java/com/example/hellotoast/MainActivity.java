package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount=0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }
    //show toast when the toast button is clicked
    //@param view: is the view that triggers  the onClick handler. Is not used since
    //              toast always shows on top
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    //increments the number in the TextView when the Count button is clicked
    //@param view: is the view that triggers the onClick handler. Is not used since
    //              count appears inside the view
    public void countUp(View view) {
        mCount++;
        //make sure the view is not null
        if(mShowCount!=null)
            mShowCount.setText(Integer.toString(mCount));
    }
}