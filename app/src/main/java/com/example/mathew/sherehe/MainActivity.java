package com.example.mathew.sherehe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView eventsListView;
    private Button add, view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        add = (Button) findViewById(R.id.add_event);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddEvent.class));
            }
        });

        eventsListView = (ListView) findViewById(R.id.events);
        ArrayList<Event> events = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Event event = new Event();
            event.setName("Event One");
            event.setTime("12:45PM");
            events.add(event);
        }

        EventAdapter eventAdapter = new EventAdapter(this, events);
        eventsListView.setAdapter(eventAdapter);

    }

}
