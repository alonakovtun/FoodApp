package com.example.foodapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodapp.R;
import com.example.foodapp.adapters.FeaturedAdapter;
import com.example.foodapp.adapters.FeaturedVerAdapter;
import com.example.foodapp.models.FeaturedModel;
import com.example.foodapp.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;
    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);

        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        featuredVerModelList = new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.coffee2, "Popular 1", "Description 1", "4.8", "10:00-17:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.burger4, "Popular 2", "Description 2", "4.8", "10:00-17:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.dinner2, "Popular 3", "Description 3", "4.8", "10:00-17:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fries, "Popular 4", "Description 4", "4.8", "10:00-17:00"));

        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);

        return view;
    }
}