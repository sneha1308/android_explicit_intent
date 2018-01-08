package com.smartron.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public EditText text_et;
    private Button click_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_et = findViewById(R.id.text_et);

        click_btn = findViewById(R.id.click_btn);
        click_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String text = text_et.getText().toString();
        if (TextUtils.isEmpty(text)) {
            text_et.setError("empty..!");
        } else {
            Intent intent = new Intent(this, DisplayActivity.class);
            intent.putExtra("mytext", text);
            startActivity(intent);
        }
    }
}
