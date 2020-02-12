package com.example.calculateone;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText el1, el2;
    TextView rez_vol;
    double volume1, volume2, num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        el1 = findViewById(R.id.num1);
        el2 = findViewById(R.id.num2);
        rez_vol = findViewById(R.id.rez);

        num1 = Integer.parseInt(el1.getText().toString());
        num2 = Integer.parseInt(el2.getText().toString());

    }

    public void rez_rad(View view) {
        volume1 = Math.PI * Math.pow(num1,2) * num2;
        rez_vol.setText((int) volume1);
        //rez_vol.setText("Объем по диаметру");
    }

    public void rez_dia(View view) {
        volume2 = Math.PI * 0.25 * Math.pow(num1,2) * num2;
        rez_vol.setText((int) volume2);
        //rez_vol.setText("Объем по диаметру");
    }
}
