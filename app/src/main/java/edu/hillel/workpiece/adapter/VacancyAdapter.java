package edu.hillel.workpiece.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import edu.hillel.workpiece.R;
import edu.hillel.workpiece.model.Vacancy;

/**
 * Created by yuriy on 17.07.16.
 */
public class VacancyAdapter extends ArrayAdapter<Vacancy> {

    private LayoutInflater mInfleter;

    public VacancyAdapter(Context context, List<Vacancy> objects) {
        super(context, R.layout.vacancy_item, objects);
        mInfleter = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ItemViewHolder ivh;

        if (convertView == null) {
            convertView = mInfleter.inflate(R.layout.vacancy_item, parent, false);
            ivh = new ItemViewHolder(convertView);
            convertView.setTag(ivh);
        } else {
            ivh = (ItemViewHolder) convertView.getTag();
        }

        Vacancy vacancy = getItem(position);
        ivh.setData(vacancy);

        return convertView;
    }

    private class ItemViewHolder {
        TextView tvPosition;
        TextView tvSalary;
        ImageView ivCompanyIcon;
        TextView tvDateOfDeparture;
        TextView tvTypeOfVessel;
        TextView tvEnglishLevel;
        TextView tvCompany;

        public ItemViewHolder(View view) {
            tvPosition = (TextView) view.findViewById(R.id.tvPosition);
            tvSalary = (TextView) view.findViewById(R.id.tvSalary);
            ivCompanyIcon = (ImageView) view.findViewById(R.id.ivCompanyIcon);
            tvDateOfDeparture = (TextView) view.findViewById(R.id.tvDateOfDeparture);
            tvTypeOfVessel = (TextView) view.findViewById(R.id.tvTypeOfVessel);
            tvEnglishLevel = (TextView) view.findViewById(R.id.tvEnglishLevel);
            tvCompany = (TextView) view.findViewById(R.id.tvCompany);
        }

        public void setData(Vacancy vacancy) {
            tvPosition.setText(vacancy.getPosition());
            tvSalary.setText(String.valueOf(vacancy.getSalary()));
            ivCompanyIcon.setImageResource(vacancy.getCompanyIconId());
//            tvDateOfDeparture.setText(vacancy.getDateOfDeparture());
//            tvTypeOfVessel.setText(vacancy.getTypeOfVessel());
//            tvEnglishLevel.setText(vacancy.getEnglishLevel());
//            tvCompany.setText(vacancy.getCompanyName());
        }
    }
}
