package com.example.rooms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderActivity extends AppCompatActivity {
    Button outt, inn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        inn = findViewById(R.id.incoming_btn);
        outt = findViewById(R.id.outgoing_btn);

        inn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this, IncomingActivity.class);
                startActivity(intent);
                finish();
            }
        });

        outt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inntent = new Intent(OrderActivity.this, OutgoingActivity.class);
                startActivity(inntent);
                finish();
            }
        });
    }
}