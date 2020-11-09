package com.example.ltts25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View view) {
        Toast.makeText(this, "Welcome manasa", Toast.LENGTH_SHORT).show();
        TextView welcomeTextView;

        EditText nameEditText,passw;

        nameEditText=findViewById(R.id.edittextname);
        passw=findViewById(R.id.textpass);
        String input=nameEditText.getText().toString();
        String password=passw.getText().toString();
        welcomeTextView=findViewById(R.id.textViewwelcome);
        welcomeTextView.setText(input);
        welcomeTextView=findViewById(R.id.textpwd);
        welcomeTextView.setText(password);

    }
}