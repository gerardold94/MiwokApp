package com.example.android.miwok.Adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.Models.Word;

import java.util.ArrayList;

/**
 * Created by gerardo on 06/06/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int mColorResourceId) {
        super(context, 0, words);
        this.mColorResourceId = mColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater
                    .from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.english_textview);
        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        defaultTranslation.setText(currentWord.getDefaultTranslation());
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        ImageView imageResource = (ImageView) listItemView.findViewById(R.id.image_resource);
        if (currentWord.hasImage()) {
            imageResource.setImageResource(currentWord.getmImageResourceId());
            imageResource.setVisibility(View.VISIBLE);
        } else {
            imageResource.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
