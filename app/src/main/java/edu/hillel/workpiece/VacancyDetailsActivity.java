package edu.hillel.workpiece;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;
import edu.hillel.workpiece.model.Vacancy;

public class VacancyDetailsActivity extends AppCompatActivity {

    public static final String ACTION = "edu.hillel.workpiece.action.GET_VACANCY_DETAILS";
    public static final String EXTRAS_VACANCY = "extras_vacancy";

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacancy_details);

        mToolbar = (Toolbar) findViewById(R.id.tbToolbar);
        mToolbar.setTitle("Vacancy Details");
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(mToolbar);

        TextView tvPosition = (TextView) findViewById(R.id.tvPosition);
        TextView tvSalary = (TextView) findViewById(R.id.tvSalary);
        ImageView ivCompanyIcon = (ImageView) findViewById(R.id.ivCompanyIcon);
        TextView tvDateOfDeparture = (TextView) findViewById(R.id.tvDateOfDeparture);
        TextView tvTypeOfVessel = (TextView) findViewById(R.id.tvTypeOfVessel);
        TextView tvEnglishLevel = (TextView) findViewById(R.id.tvEnglishLevel);
        TextView tvCompany = (TextView) findViewById(R.id.tvCompany);
        TextView tvNavigationArea = (TextView) findViewById(R.id.tvNavigationArea);
        TextView tvYearOfBuilt = (TextView) findViewById(R.id.tvYearOfBuilt);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Vacancy vacancy = (Vacancy) extras.getSerializable(VacancyDetailsActivity.EXTRAS_VACANCY);

            tvPosition.setText(vacancy.getPosition());
            tvSalary.setText(String.valueOf(vacancy.getSalary()));
            ivCompanyIcon.setImageResource(vacancy.getCompanyIconId());
            tvDateOfDeparture.setText(vacancy.getDateOfDeparture());
            tvTypeOfVessel.setText(vacancy.getTypeOfVessel());
            tvEnglishLevel.setText(vacancy.getEnglishLevel());
            tvCompany.setText(vacancy.getCompanyName());
            tvNavigationArea.setText(vacancy.getNavigationArea());
            tvYearOfBuilt.setText(String.valueOf(vacancy.getYearOfBuilt()));
        }
    }
}
