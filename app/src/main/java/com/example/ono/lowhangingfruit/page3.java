package com.example.ono.lowhangingfruit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    protected void goToPageFour(View view) {
        Intent intent = new Intent(this, page4.class);
        startActivity(intent);
    }

    protected void goBack(View view){
        finish();
    }
}
