package com.lovineoduor.bloodbank;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DonateActivity extends AppCompatActivity {

    private String[] mName;
    private String[] mEmail;
    private String[] mPhone;
    private String[] mAddress;


    @BindView(R.id.thisList)
    ListView mListview;
    private Object ListView;
    private Object ListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
        ButterKnife.bind(this);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");
        String Address = intent.getStringExtra("address");

        this.mName = new String[]{name};
        this.mEmail = new String[]{email};
        this.mPhone = new String[]{phone};
        this.mAddress = new String[]{Address};



         DonateActivity donateActivity = new DonateActivity() ;(this, android.R.layout.simple_list_item_1, mName, mEmail, mAddress, mPhone);
        mListview.setAdapter((android.widget.ListAdapter) ListAdapter);
        Toast.makeText(DonateActivity.this,  name + " Awesome! your account has been created successfully...you may now donate blood ", Toast.LENGTH_LONG).show();



    }




}
