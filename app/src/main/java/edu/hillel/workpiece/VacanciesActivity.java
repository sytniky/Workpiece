package edu.hillel.workpiece;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.LinkedList;
import java.util.List;
import edu.hillel.workpiece.adapter.VacancyAdapter;
import edu.hillel.workpiece.model.Vacancy;


public class VacanciesActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    List<Vacancy> mVacancyData;
    VacancyAdapter mVacancyAdapter;
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacancies);

        mToolbar = (Toolbar) findViewById(R.id.tbToolbar);
        mToolbar.setTitle(R.string.vacancies_activity_toolbar_title);
        mToolbar.setNavigationIcon(R.drawable.ic_menu);
        setSupportActionBar(mToolbar);

        initVacancies();

        ListView lvVacacies = (ListView) findViewById(R.id.lvVacacies);

        mVacancyAdapter = new VacancyAdapter(this, mVacancyData);
        lvVacacies.setAdapter(mVacancyAdapter);
        lvVacacies.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.vacancies_activity_action, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itmFavorite:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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
                        R.drawable.ic_marlow_navigation,
                        "Marlow Navigation",
                        "Chief Engineer",
                        "Jan 20, 2016",
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
                        R.drawable.ic_marlow_navigation,
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
                        R.drawable.ic_marlow_navigation,
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
                        R.drawable.ic_marlow_navigation,
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
                        R.drawable.ic_marlow_navigation,
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
                        R.drawable.ic_marlow_navigation,
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
                        R.drawable.ic_marlow_navigation,
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
                        R.drawable.ic_marlow_navigation,
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
                        R.drawable.ic_marlow_navigation,
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
                        R.drawable.ic_marlow_navigation,
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
                        R.drawable.ic_marlow_navigation,
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
                        R.drawable.ic_marlow_navigation,
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
