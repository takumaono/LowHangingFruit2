package com.example.ono.lowhangingfruit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
    }

    protected void goToEnd(View view) {
        Intent intent = new Intent(this, end.class);
        startActivity(intent);
    }

    protected void goBack(View view){
        finish();
    }
}
