package com.example.nishant.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nishant on 8/17/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    int list_view_colour =-1;

    public WordAdapter(Context context,int resource) {
        super(context, resource);
    }
    public WordAdapter(Context context,ArrayList<Word> words) {
        super(context,0,words);
    }

    public WordAdapter(Context context,ArrayList<Word> words,int colourid) {
        super(context,0,words);
        list_view_colour =colourid;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listitemview=convertView;
        if(listitemview==null)
            listitemview = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        Word currentWord=getItem(position);
        ImageView imageView=listitemview.findViewById(R.id.image_view);
        TextView textView1=listitemview.findViewById(R.id.text_view_1);
        TextView textView2=listitemview.findViewById(R.id.text_view_2);
        textView1.setText(currentWord.getName_of_place());
        textView2.setText(currentWord.getAddress_of_place());
        TextView textView3=listitemview.findViewById(R.id.text_view_3);
        if(currentWord.hasCost()) {
            textView3.setText(currentWord.getCost_of_place());
        }
        if(currentWord.hasImageid()){
            imageView.setImageResource(currentWord.getImageid());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }
        if(list_view_colour !=-1){
            View textcontainer=(View)listitemview.findViewById(R.id.container);
            int color = ContextCompat.getColor(getContext(), list_view_colour);
            textcontainer.setBackgroundColor(color);}
        return listitemview;
    }
}
