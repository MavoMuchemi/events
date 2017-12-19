package com.example.mathew.sherehe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddEvent extends AppCompatActivity {

    private EditText time, name, location;
    private Button button;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        spinner = (Spinner) findViewById(R.id.event_type);
        time = (EditText) findViewById(R.id.event_time);
        name = (EditText) findViewById(R.id.event_name);
        location = (EditText) findViewById(R.id.event_location);
        button = (Button) findViewById(R.id.add_event);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strTime = time.getText().toString().trim();
                String strName = time.getText().toString().trim();
                String strLocation = time.getText().toString().trim();

                addEvent(strName, strTime, strLocation);

            }
        });

    }

    private void addEvent(String strName, String strTime, String strLocation) {
/// Implement database to be used
    }
}
