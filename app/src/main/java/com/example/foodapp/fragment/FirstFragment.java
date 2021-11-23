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


public class FirstFragment extends Fragment {

    ///////////////////HORIZONTAL//////////////////////////
    List<FeaturedModel> featuredModelList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    ///////////////////Vertical//////////////////////////
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;
    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);


        ///////////////////HORIZONTAL//////////////////////////
        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        featuredModelList = new ArrayList<>();

        featuredModelList.add(new FeaturedModel(R.drawable.fav1, "Featured 1", "Description 1"));
        featuredModelList.add(new FeaturedModel(R.drawable.fav2, "Featured 2", "Description 2"));
        featuredModelList.add(new FeaturedModel(R.drawable.fav3, "Featured 3", "Description 3"));

        featuredAdapter = new FeaturedAdapter(featuredModelList);
        recyclerView.setAdapter(featuredAdapter);

        ///////////////////Vertical//////////////////////////
        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        featuredVerModelList = new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fav1, "Featured 1", "Description 1", "4.8", "10:00-17:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fav2, "Featured 2", "Description 2", "4.8", "10:00-17:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fav3, "Featured 3", "Description 3", "4.8", "10:00-17:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fav1, "Featured 4", "Description 4", "4.8", "10:00-17:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fav2, "Featured 5", "Description 5", "4.8", "10:00-17:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fav3, "Featured 6", "Description 6", "4.8", "10:00-17:00"));

        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);

        return view;
    }
}