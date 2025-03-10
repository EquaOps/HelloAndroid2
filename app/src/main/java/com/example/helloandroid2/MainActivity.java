package com.example.helloandroid2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    private EditText numInput1, numInput2;
    private Button plusButton, minusButton, multiplicationButton, divisionButton;
    private ImageButton resetButton;
    private TextView resultField;

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

        numInput1 = findViewById(R.id.numberField1);
        numInput2 = findViewById(R.id.numberField2);
        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        multiplicationButton = findViewById(R.id.multiplicationButton);
        divisionButton = findViewById(R.id.divisionButton);
        resetButton = findViewById(R.id.resetButton);
        resultField = findViewById(R.id.resultField);
    }

    public void setResultField(double result){
        String resultStr = String.format("%.2f",result);
        resultField.setText(new StringBuilder(resultStr));
    }
    public void plusButtonClicked(View view){
        double num1, num2;
        try{
            num1 = Double.valueOf(numInput1.getText().toString());
            num2 = Double.valueOf(numInput2.getText().toString());
        }catch(NumberFormatException e){
            resultField.setText(new StringBuilder("NaN Error!"));
            return;
        }
        setResultField(num1+num2);
    }
    public void minusButtonClicked(View view){
        double num1, num2;
        try{
            num1 = Double.valueOf(numInput1.getText().toString());
            num2 = Double.valueOf(numInput2.getText().toString());
        }catch(NumberFormatException e){
            resultField.setText(new StringBuilder("NaN Error!"));
            return;
        }
        setResultField(num1-num2);
    }
    public void multiplicationButtonClicked(View view){
        double num1, num2;
        try{
            num1 = Double.valueOf(numInput1.getText().toString());
            num2 = Double.valueOf(numInput2.getText().toString());
        }catch(NumberFormatException e){
            resultField.setText(new StringBuilder("NaN Error!"));
            return;
        }
        setResultField(num1*num2);
    }
    public void divisionButtonClicked(View view){
        double num1, num2;
        try{
            num1 = Double.valueOf(numInput1.getText().toString());
            num2 = Double.valueOf(numInput2.getText().toString());
        }catch(NumberFormatException e){
            resultField.setText(new StringBuilder("NaN Error!"));
            return;
        }
        setResultField(num1/num2);
    }

    public void resetButtonClicked(View view){
        resultField.setText("Result Here!");
        numInput1.setText("");
        numInput2.setText("");
    }
}