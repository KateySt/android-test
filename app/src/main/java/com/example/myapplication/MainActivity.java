package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPassword;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addListenerOnButton();
    }

    public void addListenerOnButton(){
        editTextPassword = findViewById(R.id.editTextTextPassword);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,editTextPassword.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onButtonClick(View view) {
        EditText num1 = (EditText) findViewById(R.id.Num1);
        EditText num2 = (EditText) findViewById(R.id.Num2);
        TextView result = (TextView) findViewById(R.id.Result);

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());

        result.setText(String.valueOf(number1 + number2));
    }
}