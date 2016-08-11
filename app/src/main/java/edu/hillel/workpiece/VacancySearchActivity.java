package edu.hillel.workpiece;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.HashMap;

public class VacancySearchActivity extends AppCompatActivity {

    String[] mPositionData = new String[] {"Master", "Chief officer"};
    String[] mTypeOfVessel = new String[] {"Dry Cargo"};
    HashMap<String, String> mSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacancy_search);

        Spinner spPosition = (Spinner) findViewById(R.id.spPosition);
        ArrayAdapter positionAdapter = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item, mPositionData);
        spPosition.setAdapter(positionAdapter);

        spPosition.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mSearch.put("position", mPositionData[i]);
            }
        });

        Spinner spTypeOfVessel = (Spinner) findViewById(R.id.spTypeOfVessel);
        ArrayAdapter typeOfVesselAdapter = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item, mTypeOfVessel);
        spTypeOfVessel.setAdapter(typeOfVesselAdapter);
    }
}
