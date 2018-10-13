package com.example.goyal.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void startSer(View view){                  //started type service
       Intent intent = new Intent(this,MyService.class);
       startService(intent);

   }                                    
   public void stopSer(View view){
        Intent intent = new Intent(this,MyService.class);
        stopService(intent);
   }
}