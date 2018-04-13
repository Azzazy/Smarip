package com.muhammadazzazy.smarip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WallChipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wall_chip);
        findViewById(R.id.iv_back_wall_chip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
