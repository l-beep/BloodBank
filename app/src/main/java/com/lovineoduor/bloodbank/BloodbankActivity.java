package com.lovineoduor.bloodbank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BloodbankActivity  extends AppCompatActivity {
    @BindView(R.id.locationTextView)
TextView mLocationTextView;
    @BindView(R.id.listView)
    ListView mListView;
    private String[] donations = new String[] {"A+", "A+","AB", "O","O","O","AB"
            };
    private String[] requests = new String[] {"B-","AB-","A-"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodbank);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        BloodbankArrayAdapter adapter = new BloodbankArrayAdapter(this, android.R.layout.simple_list_item_1, donations, requests);
        mListView.setAdapter((ListAdapter) adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(BloodbankActivity.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });
        mLocationTextView.setText("Here are the blood donations and Requests: " + location);
    }


}
