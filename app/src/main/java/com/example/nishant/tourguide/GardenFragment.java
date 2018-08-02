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

public class GardenFragment extends Fragment {
    public GardenFragment() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view,container,false);
        ArrayList<Word> words=new ArrayList<>();
        words.add(new Word(R.drawable.rock_garden,getString(R.string.rock_name),R.string.rock_garden));
        words.add(new Word(R.drawable.butterfly,getString(R.string.butterfly),R.string.butterfly_garden));
        words.add(new Word(R.drawable.chandigarh_botanical,getString(R.string.batonical_name),R.string.batonical_garden));
        words.add(new Word(R.drawable.garden_of_fragrance,getString(R.string.fragenence_name),R.string.fragnence_garden));
        words.add(new Word(R.drawable.japenese,getString(R.string.japenese_name),R.string.japenese_garden));
        words.add(new Word(R.drawable.rose_garden,getString(R.string.rose_name),R.string.rose_garden));
        words.add(new Word(R.drawable.sukhna_lake,getString(R.string.sukhna_name),R.string.sukhna_lake));
        words.add(new Word(R.drawable.terraced,getString(R.string.terraced_name),R.string.terraced_garden));

        WordAdapter adapter=new WordAdapter(getActivity(),words,R.color.colorAccent);
        ListView listView=(ListView)rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        return rootView;
    }
}
