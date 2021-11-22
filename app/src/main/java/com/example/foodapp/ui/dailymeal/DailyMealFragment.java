package com.example.foodapp.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.adapters.DailyMealAdapter;
import com.example.foodapp.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_daily_meal, container, false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast, "Breakfast", "50% OFF", "breakfast", "Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch, "Lunch", "30% OFF", "lunch", "Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner, "Dinner", "10% OFF", "dinner", "Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets, "Sweets", "15% OFF", "sweets","Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffee, "Coffee", "25% OFF", "coffee", "Description"));

        dailyMealAdapter = new DailyMealAdapter(getContext(), dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();
        return root;
    }


}