package com.example.projectmakan;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectmakan.adapters.AllRestaurantsAdapter;
import com.example.projectmakan.adapters.ExclusiveAdapter;
import com.example.projectmakan.adapters.OffersAdapter;
import com.example.projectmakan.models.AllRestaurantModels;
import com.example.projectmakan.models.ExclusiveModels;
import com.example.projectmakan.models.OffersModels;

import java.util.ArrayList;
import java.util.List;

public class RestaurantActivity extends AppCompatActivity {

    RecyclerView recyclerViewOffers;
    List<OffersModels> OffersModels;
    OffersAdapter OffersAdapter;

    RecyclerView recyclerViewExclusive;
    List<ExclusiveModels> exclusiveModels;
    ExclusiveAdapter exclusiveAdapter;

    RecyclerView recyclerViewAllRestaurant;
    List<AllRestaurantModels> allRestaurantModels;
    AllRestaurantsAdapter allRestaurantsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_restaurant);

        getOffers();

        getAllExclusive();
        getAllRestaurantsData();
    }

    private void getAllExclusive() {

        recyclerViewExclusive = findViewById(R.id.rec_exc);
        recyclerViewOffers.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewExclusive.setHasFixedSize(true);

        exclusiveModels = new ArrayList<>();
        exclusiveModels.add(new ExclusiveModels(R.drawable.food1));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food2));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food3));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food4));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food1));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food2));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food3));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food4));

        exclusiveAdapter = new ExclusiveAdapter(exclusiveModels);
        recyclerViewExclusive.setAdapter(exclusiveAdapter);

    }

    private void getAllRestaurantsData() {

        recyclerViewAllRestaurant = findViewById(R.id.rec_all_res);
        recyclerViewAllRestaurant.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerViewExclusive.setHasFixedSize(true);

        allRestaurantModels = new ArrayList<>();
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food4));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food3));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food2));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food1));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food4));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food3));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food2));
        allRestaurantModels.add(new AllRestaurantModels(R.drawable.food1));


        allRestaurantsAdapter = new AllRestaurantsAdapter(allRestaurantModels);
        recyclerViewAllRestaurant.setAdapter(allRestaurantsAdapter);
    }

    private void getOffers() {

        recyclerViewOffers = findViewById(R.id.rec_offer);
        recyclerViewOffers.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewOffers.setHasFixedSize(true);

        OffersModels = new ArrayList<>();
        OffersModels.add(new OffersModels(R.drawable.img15));
        OffersModels.add(new OffersModels(R.drawable.img16));
        OffersModels.add(new OffersModels(R.drawable.img19));
        OffersModels.add(new OffersModels(R.drawable.img18));
        OffersAdapter = new OffersAdapter(OffersModels);
        recyclerViewOffers.setAdapter(OffersAdapter);
    }
}