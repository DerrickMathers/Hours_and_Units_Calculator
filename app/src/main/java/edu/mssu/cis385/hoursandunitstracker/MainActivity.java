package edu.mssu.cis385.hoursandunitstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    public FloatingActionButton addHoursFAB;

    public Double cOneHours = 0.0;
    public Double cTwoHours = 0.0;
    public Double cThreeHours = 0.0;

    public Double cOneUnits = 0.0;
    public Double cTwoUnits = 0.0;
    public Double cThreeUnits = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addHoursFAB = findViewById(R.id.addHoursFAB);

        addHoursFAB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddHours.class);
                startActivity(intent);
            }
        });

        TextView clientOneHours = (TextView) findViewById(R.id.cOneHoursTextView);
        TextView clientTwoHours = (TextView) findViewById(R.id.cTwoHoursTextView);
        TextView clientThreeHours = (TextView) findViewById(R.id.cThreeHoursTextView);

        TextView clientOneUnits = (TextView) findViewById(R.id.cOneUnitsTextView);
        TextView clientTwoUnits = (TextView) findViewById(R.id.cTwoUnitsTextView);
        TextView clientThreeUnits = (TextView) findViewById(R.id.cThreeUnitsTextView);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            cOneHours = extras.getDouble("clientOne");
            cTwoHours = extras.getDouble("clientTwo");
            cThreeHours = extras.getDouble("clientThree");
        }

        clientOneHours.setText(cOneHours.toString());
        clientTwoHours.setText(cTwoHours.toString());
        clientThreeHours.setText(cThreeHours.toString());

        cOneUnits = (cOneHours * 4);
        cTwoUnits = (cTwoHours * 4);
        cThreeUnits = (cThreeHours * 4);


        clientOneUnits.setText(cOneUnits.toString());
        clientTwoUnits.setText(cTwoUnits.toString());
        clientThreeUnits.setText(cThreeUnits.toString());

    }
}
