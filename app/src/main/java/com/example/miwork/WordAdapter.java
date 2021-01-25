package com.example.miwork;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mcolorResouceId;
    public WordAdapter(Activity context, ArrayList<Word> Numbers, int colorResouceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Numbers);
        mcolorResouceId=colorResouceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentview = getItem(position);
        TextView miwokview = (TextView) listitemView.findViewById(R.id.miwok_text_view);
        miwokview.setText(currentview.getMiwokTranslation());

        TextView englishview = (TextView) listitemView.findViewById(R.id.default_text_view);
        englishview.setText(currentview.getDefaultTranslation());

        ImageView imageView = (ImageView) listitemView.findViewById(R.id.image);
        if(currentview.hasImage()) {
            imageView.setImageResource(currentview.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listitemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mcolorResouceId);
        textContainer.setBackgroundColor(color);
        return listitemView;
    }
}
