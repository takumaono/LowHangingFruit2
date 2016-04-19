package com.example.ono.lowhangingfruit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    protected void goToPageThree(View view) {
        Intent intent = new Intent(this, page3.class);
        startActivity(intent);
    }

    protected void goBack(View view){
        finish();
    }
}
