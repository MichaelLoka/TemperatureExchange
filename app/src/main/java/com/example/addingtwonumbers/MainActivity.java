package com.example.addingtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcBtn = findViewById(R.id.CalcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               Temperature curTemp = new Temperature();
               EditText tempInput = (EditText)findViewById(R.id.Temp);
               float temp = Float.parseFloat(tempInput.getText().toString());
               RadioButton celsius = (RadioButton)findViewById(R.id.CelsiusRadioBtn);
               RadioButton fahrenheit = (RadioButton)findViewById(R.id.FahrenheitRadioBtn);

               if(!(tempInput.getText().toString().equals(""))){
                   if(celsius.isChecked()){
                       curTemp.setTemperature(temp);
                       float newTemp = curTemp.convertToCelsius();
                       tempInput.setText(String.valueOf(newTemp));
                   }
                   else if(fahrenheit.isChecked()){
                       curTemp.setTemperature(temp);
                       float newTemp = curTemp.convertToFahrenheit();
                       tempInput.setText(String.valueOf(newTemp));
                   }
               }
               else{
                   Toast.makeText(getApplicationContext(),"Please Enter a Valid Number", Toast.LENGTH_LONG).show();
               }
           }
        });
    }
}

