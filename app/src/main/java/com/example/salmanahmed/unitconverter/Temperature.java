package com.example.salmanahmed.unitconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.salmanahmed.unitconverter.R.id.editText12;

/**
 * Created by Salman Ahmed on 3/16/2017.
 */

public class Temperature extends AppCompatActivity {
    EditText Value;
    TextView result;
    String itempos;
    String itemposi;
    float val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);
        Intent intent = getIntent();

        Spinner dropdown = (Spinner) findViewById(R.id.spinner6);
        Value = (EditText) findViewById(R.id.editText10);

        String[] items = new String[]{"Fahrenheit", "Celsius"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);

        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itempos = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Spinner dropdown1 = (Spinner) findViewById(R.id.spinner7);
        String[] items1 = new String[]{"Fahrenheit", "Celsius"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown1.setAdapter(adapter1);

        dropdown1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemposi = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton5);
        imageButton.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View arg0) {
                                               val = Float.valueOf(Value.getText().toString());
                                               result = (TextView) findViewById(editText12);

                                               double r;
                                               if ((itempos.equals("Celsius")) && (itemposi.equals("Fahrenheit"))) {
                                                   r = (1.8 * val) + 32;
                                                   result.setText(String.valueOf(r));
                                               } else if ((itempos.equals("Fahrenheit")) && (itemposi.equals("Celsius"))) {
                                                   r = (val - 32) / 1.8;
                                                   result.setText(String.valueOf(r));
                                               } else if ((itempos.equals("Fahrenheit")) && (itemposi.equals("Fahrenheit"))) {

                                                   result.setText(String.valueOf(val));
                                               } else if ((itempos.equals("Celsius")) && (itemposi.equals("Celsius"))) {

                                                   result.setText(String.valueOf(val));
                                               }
                                           }
                                       }
        );
    }
}
