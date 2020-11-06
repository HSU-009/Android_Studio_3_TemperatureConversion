package com.example.android_studio_3_temperatureconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edittext1,edittext2;
    private Button Fahrenheit,Celsius;
    private double c,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviews();
    }

    private void findviews(){
        edittext1=(EditText)findViewById(R.id.edittext1);
        edittext2=(EditText)findViewById(R.id.edittext2);
        Fahrenheit=(Button)findViewById(R.id.Fahrenheit);
        Celsius=(Button)findViewById(R.id.Celsius);

        Fahrenheit.setOnClickListener(listener);
        Celsius.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }
    View.OnClickListener listener=new View.OnClickListener() {


        public void onClick(View v) {

            if(v.getId()==R.id.Fahrenheit){
                try{
                    c=Double.parseDouble(edittext1.getText().toString());
                }catch (NumberFormatException e){
                }
                f=c*9/5+32;
                edittext2.setText(String.valueOf(f));
            }
            else if(v.getId()==R.id.Celsius) {

                try{
                    f=Double.parseDouble(edittext2.getText().toString());
                }catch (NumberFormatException e){
                }
                c=(f-32)*5/9;
                edittext1.setText(String.valueOf(c));
            }
        }
    };
}