package com.projects.anticovid_19.MythBusters;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.projects.anticovid_19.R;

import java.util.ArrayList;
import java.util.List;


public class MythBuster extends Fragment {

    View view;
    private RecyclerView precRecycler;
    private List<MythBusterModel> precList = new ArrayList<>();
    private String[] titles;
    private String[] contents;

    public MythBuster() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_myth_buster, container, false);
        init();

        return view;
    }

    private void init() {
        initElements();
    }

    private void initElements() {
        precRecycler = view.findViewById(R.id.precRecycler);
        titles = MythBusterContent.getTitles();
        contents = MythBusterContent.getContents();



        for (int i = 0; i < titles.length; i++) {
            precList.add(new MythBusterModel(titles[i], contents[i]));
        }
        precRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));


        precRecycler.setAdapter(new MythBusterAdapter(getActivity(), precList));
    }


}

