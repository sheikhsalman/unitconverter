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

import static com.example.salmanahmed.unitconverter.R.id.editText2;
import static com.example.salmanahmed.unitconverter.R.id.editText3;
import static com.example.salmanahmed.unitconverter.R.id.editText5;
import static com.example.salmanahmed.unitconverter.R.id.imageButton;

/**
 * Created by Salman Ahmed on 3/16/2017.
 */

public class Length extends AppCompatActivity {
    EditText Value;
    TextView result;
    String itempos;
    String itemposi;
    float val;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length);
        Intent intent = getIntent();
        Value = (EditText) findViewById(editText5);


        Spinner dropdown = (Spinner) findViewById(R.id.spinner2);
        String[] items = new String[]{"feet", "meters", "miles", "yards"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
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

        Spinner dropdown1 = (Spinner) findViewById(R.id.spinner3);
        String[] items1 = new String[]{"feet", "meters", "miles", "yards"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        dropdown1.setAdapter(adapter1);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemposi = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton4);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                val = Float.valueOf(Value.getText().toString());
                result = (TextView) findViewById(editText3);
                double r;
                if ((itempos.equals("feet")) && (itemposi.equals("meters"))) {
                    r = val * 0.3048;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("feet")) && (itemposi.equals("miles"))) {
                    r = val * 0.000189394;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("feet")) && (itemposi.equals("yards"))) {
                    r = val * 0.333333;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("meters")) && (itemposi.equals("feet"))) {
                    r = val * 3.28;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("meters")) && (itemposi.equals("miles"))) {
                    r = val * 0.000621371;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("meters")) && (itemposi.equals("yards"))) {
                    r = val * 1.09361;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("miles")) && (itemposi.equals("feet"))) {
                    r = val * 5280;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("miles")) && (itemposi.equals("meters"))) {
                    r = val * 1609.34;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("miles")) && (itemposi.equals("yards"))) {
                    r = val * 1760;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("yards")) && (itemposi.equals("feet"))) {
                    r = val * 3;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("yards")) && (itemposi.equals("meters"))) {
                    r = val * 0.9144;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("yards")) && (itemposi.equals("miles"))) {
                    r = val * 0.000568182;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("feet")) && (itemposi.equals("feet"))) {
                    result.setText(String.valueOf(val));
                } else if ((itempos.equals("meters")) && (itemposi.equals("meters"))) {
                    result.setText(String.valueOf(val));
                } else if ((itempos.equals("miles")) && (itemposi.equals("miles"))) {
                    result.setText(String.valueOf(val));
                } else if ((itempos.equals("yards")) && (itemposi.equals("yards"))) {
                    result.setText(String.valueOf(val));
                }
            }
        });
    }
}
