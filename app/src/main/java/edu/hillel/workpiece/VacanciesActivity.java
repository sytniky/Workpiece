package edu.hillel.workpiece;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;
import edu.hillel.workpiece.adapter.VacancyAdapter;
import edu.hillel.workpiece.model.Vacancy;


public class VacanciesActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    List<Vacancy> mVacancyData;
    VacancyAdapter mVacancyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacancies);

        initVacancies();

        ListView lvVacacies = (ListView) findViewById(R.id.lvVacacies);

        mVacancyAdapter = new VacancyAdapter(this, mVacancyData);
        lvVacacies.setAdapter(mVacancyAdapter);
        lvVacacies.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(VacancyDetailsActivity.ACTION);
        Vacancy vacancy = mVacancyAdapter.getItem(i);
        intent.putExtra(VacancyDetailsActivity.EXTRAS_VACANCY, vacancy);
        startActivity(intent);
    }

    private void initVacancies() {
        mVacancyData = new LinkedList<>();
        mVacancyData.add(
                new Vacancy(
                        android.R.drawable.ic_dialog_info,
                        "Marlow Navigation",
                        "Chief Engineer",
                        "30.07.2016",
                        "Dry Cargo",
                        "Good",
                        2500,
                        "Mediterranean Sea, Black Sea",
                        2001,
                        12000,
                        "Mak",
                        "Prometey",
                        "4 (+/- 1) months",
                        "Uniteam Ukraine"
                )
        );
        mVacancyData.add(
                new Vacancy(
                        android.R.drawable.ic_dialog_alert,
                        "Marlow Navigation",
                        "Chief Cook",
                        "30.07.2016",
                        "Dry Cargo",
                        "Poor",
                        4500,
                        "Mediterranean Sea, Black Sea",
                        2001,
                        12000,
                        "Mak",
                        "Prometey",
                        "4 (+/- 1) months",
                        "Uniteam Ukraine"
                )
        );
        mVacancyData.add(
                new Vacancy(
                        android.R.drawable.ic_dialog_alert,
                        "Marlow Navigation",
                        "Master",
                        "30.07.2016",
                        "Dry Cargo",
                        "Good",
                        4000,
                        "Mediterranean Sea, Black Sea",
                        2001,
                        12000,
                        "Mak",
                        "Prometey",
                        "4 (+/- 1) months",
                        "Uniteam Ukraine"
                )
        );
        mVacancyData.add(
                new Vacancy(
                        android.R.drawable.ic_dialog_info,
                        "Marlow Navigation",
                        "Chief Engineer",
                        "30.07.2016",
                        "Dry Cargo",
                        "Good",
                        2500,
                        "Mediterranean Sea, Black Sea",
                        2001,
                        12000,
                        "Mak",
                        "Prometey",
                        "4 (+/- 1) months",
                        "Uniteam Ukraine"
                )
        );
        mVacancyData.add(
                new Vacancy(
                        android.R.drawable.ic_dialog_alert,
                        "Marlow Navigation",
                        "Chief Cook",
                        "30.07.2016",
                        "Dry Cargo",
                        "Poor",
                        4500,
                        "Mediterranean Sea, Black Sea",
                        2001,
                        12000,
                        "Mak",
                        "Prometey",
                        "4 (+/- 1) months",
                        "Uniteam Ukraine"
                )
        );
        mVacancyData.add(
                new Vacancy(
                        android.R.drawable.ic_dialog_alert,
                        "Marlow Navigation",
                        "Master",
                        "30.07.2016",
                        "Dry Cargo",
                        "Good",
                        4000,
                        "Mediterranean Sea, Black Sea",
                        2001,
                        12000,
                        "Mak",
                        "Prometey",
                        "4 (+/- 1) months",
                        "Uniteam Ukraine"
                )
        );
        mVacancyData.add(
                new Vacancy(
                        android.R.drawable.ic_dialog_info,
                        "Marlow Navigation",
                        "Chief Engineer",
                        "30.07.2016",
                        "Dry Cargo",
                        "Good",
                        2500,
                        "Mediterranean Sea, Black Sea",
                        2001,
                        12000,
                        "Mak",
                        "Prometey",
                        "4 (+/- 1) months",
                        "Uniteam Ukraine"
                )
        );
        mVacancyData.add(
                new Vacancy(
                        android.R.drawable.ic_dialog_alert,
                        "Marlow Navigation",
                        "Chief Cook",
                        "30.07.2016",
                        "Dry Cargo",
                        "Poor",
                        4500,
                        "Mediterranean Sea, Black Sea",
                        2001,
                        12000,
                        "Mak",
                        "Prometey",
                        "4 (+/- 1) months",
                        "Uniteam Ukraine"
                )
        );
        mVacancyData.add(
                new Vacancy(
                        android.R.drawable.ic_dialog_alert,
                        "Marlow Navigation",
                        "Master",
                        "30.07.2016",
                        "Dry Cargo",
                        "Good",
                        4000,
                        "Mediterranean Sea, Black Sea",
                        2001,
                        12000,
                        "Mak",
                        "Prometey",
                        "4 (+/- 1) months",
                        "Uniteam Ukraine"
                )
        );
        mVacancyData.add(
                new Vacancy(
                        android.R.drawable.ic_dialog_info,
                        "Marlow Navigation",
                        "Chief Engineer",
                        "30.07.2016",
                        "Dry Cargo",
                        "Good",
                        2500,
                        "Mediterranean Sea, Black Sea",
                        2001,
                        12000,
                        "Mak",
                        "Prometey",
                        "4 (+/- 1) months",
                        "Uniteam Ukraine"
                )
        );
        mVacancyData.add(
                new Vacancy(
                        android.R.drawable.ic_dialog_alert,
                        "Marlow Navigation",
                        "Chief Cook",
                        "30.07.2016",
                        "Dry Cargo",
                        "Poor",
                        4500,
                        "Mediterranean Sea, Black Sea",
                        2001,
                        12000,
                        "Mak",
                        "Prometey",
                        "4 (+/- 1) months",
                        "Uniteam Ukraine"
                )
        );
        mVacancyData.add(
                new Vacancy(
                        android.R.drawable.ic_dialog_alert,
                        "Marlow Navigation",
                        "Master",
                        "30.07.2016",
                        "Dry Cargo",
                        "Good",
                        4000,
                        "Mediterranean Sea, Black Sea",
                        2001,
                        12000,
                        "Mak",
                        "Prometey",
                        "4 (+/- 1) months",
                        "Uniteam Ukraine"
                )
        );
    }
}
