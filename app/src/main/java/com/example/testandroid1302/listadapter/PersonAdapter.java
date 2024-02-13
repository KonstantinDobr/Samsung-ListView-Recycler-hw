package com.example.testandroid1302.listadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.testandroid1302.R;
import com.example.testandroid1302.domain.Person;

import java.util.List;

public class PersonAdapter extends ArrayAdapter<Person> {

    public PersonAdapter(Context context, List<Person> arr) {
        super(context, R.layout.item_person, arr);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_person, null);
        }

        ((TextView) convertView.findViewById(R.id.tv_id)).setText(String.valueOf(person.getId()));
        ((TextView) convertView.findViewById(R.id.tv_name)).setText(String.valueOf(person.getName()));
        ((TextView) convertView.findViewById(R.id.tv_number)).setText(String.valueOf(person.getNumber()));



        return convertView;
    }
}