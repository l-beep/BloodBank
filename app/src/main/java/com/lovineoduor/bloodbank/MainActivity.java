package com.lovineoduor.bloodbank;
//import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.findblooddonors)
    Button mFindblooddonors;
    @BindView(R.id.findbloodrequests)
    EditText mLocationEditText;
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        View donateblood = null;
        donateblood.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        View mbloodbankButton = null;
        if(v == mbloodbankButton) {
            String location = mLocationEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, BloodbankActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}