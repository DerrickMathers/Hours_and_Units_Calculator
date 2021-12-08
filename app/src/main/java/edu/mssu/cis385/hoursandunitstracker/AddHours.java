package edu.mssu.cis385.hoursandunitstracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class AddHours extends AppCompatActivity {

   public Double cOneHours;
   public Double cTwoHours;
   public Double cThreeHours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hours);


        EditText clientOneHours = (EditText) findViewById(R.id.client1HoursEditText);
        EditText clientTwoHours = (EditText) findViewById(R.id.client2HoursEditText);
        EditText clientThreeHours = (EditText) findViewById(R.id.client3HoursEditText);

        Button submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                cOneHours = Double.parseDouble(clientOneHours.getText().toString());
                cTwoHours = Double.parseDouble(clientTwoHours.getText().toString());
                cThreeHours = Double.parseDouble(clientThreeHours.getText().toString());


                 Bundle bundle = new Bundle();
                bundle.putDouble("clientOne",cOneHours );
                bundle.putDouble("clientTwo", cTwoHours);
                bundle.putDouble("clientThree", cThreeHours);

                Intent returnIntent = new Intent(AddHours.this, MainActivity.class);
                returnIntent.putExtras(bundle);
                startActivity(returnIntent);
            }
        });


    }


}