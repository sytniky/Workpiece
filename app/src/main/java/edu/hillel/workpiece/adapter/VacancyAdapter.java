package edu.hillel.workpiece.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import edu.hillel.workpiece.R;
import edu.hillel.workpiece.model.Vacancy;

/**
 * Created by yuriy on 17.07.16.
 */
public class VacancyAdapter extends BaseAdapter {

    private List<Vacancy> mVacancyData;
    private LayoutInflater mInfleter;

    public VacancyAdapter(Context c, List<Vacancy> vacancyData) {
        this.mVacancyData = vacancyData;
        mInfleter = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mVacancyData.size();
    }

    @Override
    public Vacancy getItem(int i) {
        return mVacancyData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = mInfleter.inflate(R.layout.vacancy_item, viewGroup, false);

        TextView tvPosition = (TextView) view.findViewById(R.id.tvPosition);
        TextView tvSalary = (TextView) view.findViewById(R.id.tvSalary);
        ImageView ivCompanyIcon = (ImageView) view.findViewById(R.id.ivCompanyIcon);
        TextView tvDateOfDeparture = (TextView) view.findViewById(R.id.tvDateOfDeparture);
        TextView tvTypeOfVessel = (TextView) view.findViewById(R.id.tvTypeOfVessel);
        TextView tvEnglishLevel = (TextView) view.findViewById(R.id.tvEnglishLevel);
        TextView tvCompany = (TextView) view.findViewById(R.id.tvCompany);

        Vacancy vacancy = getItem(i);

        tvPosition.setText(vacancy.getPosition());
        tvSalary.setText(String.valueOf(vacancy.getSalary()));
        ivCompanyIcon.setImageResource(vacancy.getCompanyIconId());
        tvDateOfDeparture.setText(vacancy.getDateOfDeparture());
        tvTypeOfVessel.setText(vacancy.getTypeOfVessel());
        tvEnglishLevel.setText(vacancy.getEnglishLevel());
        tvCompany.setText(vacancy.getCompanyName());

        return view;
    }
}
