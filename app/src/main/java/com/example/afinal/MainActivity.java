package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText tv_id = (EditText) findViewById(R.id.tv_id);
        Button btn_start = (Button) findViewById(R.id.btn_start);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("id",tv_id.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    // Disable back button
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
