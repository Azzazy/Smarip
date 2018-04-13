package com.muhammadazzazy.smarip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.cv_power_strip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Power Strip pressed!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), PowerStripActivity.class));
            }
        });

        findViewById(R.id.cv_wall_chip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wall Chip pressed!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
