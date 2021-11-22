package com.example.foodapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.foodapp.R;
import com.example.foodapp.adapters.DetailedDailyAdapter;
import com.example.foodapp.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("breakfast")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1, "Breakfast 1", "Description", "5.0", "25.0", "10:00-17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2, "Breakfast 2", "Description", "5.0", "25.0", "10:00-17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3, "Breakfast 3", "Description", "5.0", "25.0", "10:00-17:00"));

            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("sweets")){
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sweet1, "Sweets 1", "Description", "5.0", "25.0", "10:00-17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sweet2, "Sweets 2", "Description", "5.0", "25.0", "10:00-17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.sweet3, "Sweets 3", "Description", "5.0", "25.0", "10:00-17:00"));

            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("coffee")){
            imageView.setImageResource(R.drawable.coffee);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffee1, "Coffee 1", "Description", "5.0", "25.0", "10:00-17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffee2, "Coffee 2", "Description", "5.0", "25.0", "10:00-17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffee3, "Coffee 3", "Description", "5.0", "25.0", "10:00-17:00"));

            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("lunch")){
            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch1, "Lunch 1", "Description", "5.0", "25.0", "10:00-17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch2, "Lunch 2", "Description", "5.0", "25.0", "10:00-17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch3, "Lunch 3", "Description", "5.0", "25.0", "10:00-17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch4, "Lunch 4", "Description", "5.0", "25.0", "10:00-17:00"));

            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("dinner")){
            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner1, "Dinner 1", "Description", "5.0", "25.0", "10:00-17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner2, "Dinner 2", "Description", "5.0", "25.0", "10:00-17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner3, "Dinner 3", "Description", "5.0", "25.0", "10:00-17:00"));

            dailyAdapter.notifyDataSetChanged();
        }
    }
}