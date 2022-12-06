package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivitySave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        TextView textName = findViewById(R.id.textName);
        TextView textView = findViewById(R.id.txtView);

        String dates = "Email: " + getIntent().getStringExtra("txtMail") +
                "\n Address: " +  getIntent().getStringExtra("txtAddress") +
                "\n Department: " +  getIntent().getStringExtra("cbxDepart") +
                "\n Schedule: " + getIntent().getStringExtra("schedule");

        textName.setText("Name: " + getIntent().getStringExtra("txtName"));
        textView.setText(dates);
    }
}