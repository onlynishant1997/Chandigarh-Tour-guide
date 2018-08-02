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

public class MallsFragment extends Fragment {
    public MallsFragment() {
        super();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.list_view,container,false);


        ArrayList<Word> words=new ArrayList<>();
        words.add(new Word(R.drawable.mall_centra,getString(R.string.centra_name),R.string.mall_centra));
        words.add(new Word(R.drawable.mall_dlfcitycentre,getString(R.string.dlf_name),R.string.mall_dlf));
        words.add(new Word(R.drawable.mall_elante,getString(R.string.elante_name),R.string.mall_elante));
        words.add(new Word(R.drawable.mall_emporium,getString(R.string.emporium_name),R.string.mall_emporium));
        words.add(new Word(R.drawable.mall_northcountry,getString(R.string.north_name),R.string.mall_north_country_mall));
        words.add(new Word(R.drawable.mall_paras,getString(R.string.paras_name),R.string.mall_paras));

        WordAdapter adapter=new WordAdapter(getActivity(),words,R.color.colorAccent);
        ListView listView=(ListView)rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);



        return rootView;
    }


}
