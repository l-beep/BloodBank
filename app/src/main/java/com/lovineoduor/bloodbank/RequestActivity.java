package com.lovineoduor.bloodbank;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RequestActivity  extends AppCompatActivity {


    private String[] getGetmBloodgroup;
    private String[] getmHospitallocation;

    @BindView(R.id.thisList)
    ListView mListview;
    private Object ListAdapter;


    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String bloodgroup = intent.getStringExtra("bloodgroup");
        String hospitallocation = intent.getStringExtra("hospitallocation");


        this.getGetmBloodgroup = new String[]{bloodgroup};
        this.getmHospitallocation = new String[]{hospitallocation};


        RequestActivity requestActivity = new RequestActivity() ;(this, android.R.layout.simple_list_item_1, getGetmBloodgroup, getmHospitallocation);
        mListview.setAdapter((android.widget.ListAdapter) ListAdapter);
        Toast.makeText(RequestActivity.this,  name  + " Welcome to BloodBank ", Toast.LENGTH_LONG).show();

    }
}
