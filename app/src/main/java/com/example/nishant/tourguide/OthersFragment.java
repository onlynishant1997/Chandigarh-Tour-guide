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
 * Created by nishant on 8/18/17.
 */

public class OthersFragment extends Fragment {
    public OthersFragment() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.list_view,container,false);


        ArrayList<Word> words=new ArrayList<>();
        words.add(new Word(R.drawable.other_govtmueseum,getString(R.string.govt_meuseum_name),R.string.other_govtmeseum));
        words.add(new Word(R.drawable.other_highcoutmeuseum,getString(R.string.highcourt_name),R.string.other_highcourtmeseum));
        words.add(new Word(R.drawable.other_naturalhistorymeseum,getString(R.string.naturalhistory_name),R.string.other_naturalhistory));
        words.add(new Word(R.drawable.other_openhandmonument,getString(R.string.openhand_name),R.string.other_openhandmonument));
        words.add(new Word(R.drawable.other_zoo,getString(R.string.zoo_name),R.string.other_zoo));

        WordAdapter adapter=new WordAdapter(getActivity(),words,R.color.colorAccent);
        ListView listView=(ListView)rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);



        return rootView;    }
}
