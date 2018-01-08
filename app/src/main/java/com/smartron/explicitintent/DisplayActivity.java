package com.smartron.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    private TextView display_text_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        display_text_tv=findViewById(R.id.display_text_tv);
        display_text_tv.setText(getIntent().getStringExtra("mytext"));
    }
}
