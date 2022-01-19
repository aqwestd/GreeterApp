package com.example.greeeter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void didTapGreetButton(View view) {
        EditText greetEditText =
                (EditText) findViewById(R.id.editText);

        String name = greetEditText.getText().toString();
        String greeting = String.format("Hello, %s!", name);

        TextView messageTextView =
                (TextView) findViewById(R.id.textview);

        messageTextView.setText(greeting);
    }
}