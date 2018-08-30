package com.example.shara.newsapps1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(@NonNull Context context, @NonNull List<News> objects) {
        super(context, 0,  objects);
    }

    @NonNull

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }
        News currentmusic = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.section);
        nameTextView.setText(currentmusic.getName());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.idname);
        numberTextView.setText(currentmusic.getId());
        TextView iconView = (TextView) listItemView.findViewById(R.id.wetitl);
        iconView.setText(currentmusic.getWebtit());
        TextView iconView1 = (TextView) listItemView.findViewById(R.id.url);
        iconView.setText(currentmusic.getUrl());
        return listItemView;
    }
}
