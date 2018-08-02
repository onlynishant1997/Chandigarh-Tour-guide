package com.example.nishant.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by nishant on 8/17/17.
 */

public class HotelFragment extends Fragment {

    public HotelFragment() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.list_view,container,false);

        ArrayList<Word> words=new ArrayList<>();
        words.add(new Word(R.drawable.jw_mariot,getString(R.string.jw_mariot_name),R.string.jw_mariot,"Rs.8703"));
        words.add(new Word(R.drawable.hotel_rajshree,getString(R.string.rajshree_hotel_name),R.string.hotel_rajshree,"Rs.2449"));
        words.add(new Word(R.drawable.hyatt_regency,getString(R.string.hyatt_regency_name),R.string.hyatt_regency,"Rs.9920"));
        words.add(new Word(R.drawable.taj_hotel,getString(R.string.taj_hotel_name),R.string.taj_hotel,"Rs.7080"));
        words.add(new Word(R.drawable.red_fox,getString(R.string.red_fox_name),R.string.red_fox,"Rs.2885"));
        words.add(new Word(R.drawable.lemon_tree,getString(R.string.lemon_tree_name),R.string.lemon_tree,"Rs.5647"));



        WordAdapter adapter=new WordAdapter(getActivity(),words,R.color.colorAccent);
        ListView listView=(ListView)rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);


        return rootView;
    }
}
