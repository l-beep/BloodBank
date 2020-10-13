package com.lovineoduor.bloodbank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.creation) Button mCreateAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mCreateAccountButton.setOnClickListener(this);
    }
    public void request_blood(View view)
    {
        Intent intent=new Intent(this,RequestActivity.class);
        startActivity(intent);
    }

    public void register_doner(View view)
    {
        Intent intent=new Intent(this,DonateActivity.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {

    }
}
