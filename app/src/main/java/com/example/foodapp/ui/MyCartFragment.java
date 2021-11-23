package com.example.foodapp.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodapp.R;
import com.example.foodapp.adapters.CartAdapter;
import com.example.foodapp.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MyCartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.sweet1, "Order 1", "30", "4.5"));
        list.add(new CartModel(R.drawable.lunch1, "Order 2", "50", "4.8"));
        list.add(new CartModel(R.drawable.lunch3, "Order 3", "25", "4.1"));
        list.add(new CartModel(R.drawable.coffee2, "Order 4", "35", "4.4"));
        list.add(new CartModel(R.drawable.breakfast, "Order 5", "40", "4.9"));

        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);
        return view;
    }
}