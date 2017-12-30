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
import static com.example.salmanahmed.unitconverter.R.id.editText2;

/**
 * Created by Salman Ahmed on 3/16/2017.
 */

public class Area extends AppCompatActivity {
    EditText Value;
    TextView result;
    String itempos;
    String itemposi;
    float val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area);
        Intent intent = getIntent();

        Value = (EditText) findViewById(R.id.editText);
        Spinner dropdown = (Spinner) findViewById(R.id.spinner);
        String[] items = new String[]{"Square meters", "Square feet"};
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


        Spinner dropdown1 = (Spinner) findViewById(R.id.spinner4);
        String[] items1 = new String[]{"Square meters", "Square feet"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
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

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton6);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                val = Float.valueOf(Value.getText().toString());
                result = (TextView) findViewById(editText2);

                double r;
                if ((itempos.equals("Square meters")) && (itemposi.equals("Square feet"))) {
                    r = val * 10.764;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("Square feet")) && (itemposi.equals("Square meters"))) {
                    r = val * 0.093;
                    result.setText(String.valueOf(r));
                } else if ((itempos.equals("Square feet")) && (itemposi.equals("Square feet"))) {

                    result.setText(String.valueOf(val));
                } else if ((itempos.equals("Square meters")) && (itemposi.equals("Square meters"))) {

                    result.setText(String.valueOf(val));
                }
            }
        });

    }
}
