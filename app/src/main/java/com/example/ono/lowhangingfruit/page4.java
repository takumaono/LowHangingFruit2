package com.example.ono.lowhangingfruit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
    }

    protected void goToPageFive(View view) {
        Intent intent = new Intent(this, page5.class);
        startActivity(intent);
    }

    protected void goBack(View view){
        finish();
    }
}
