package com.anything.recycleraapterlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.anything.recylib.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    Button tbn_toaster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbn_toaster=findViewById(R.id.toast);

        tbn_toaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToasterMessage.s(MainActivity.this,"Okkkk");
            }
        });


    }
}