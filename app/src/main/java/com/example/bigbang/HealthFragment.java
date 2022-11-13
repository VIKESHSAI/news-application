package com.example.bigbang;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HealthFragment extends Fragment {
    String api = "4eaa3845b73f422da8b42e12d3557af7";
    ArrayList<APIMain> APIMainArrayList;
    Adapter adapter;
    String country = "in";
    private RecyclerView recyclerViewofhealth;
    private String category = "health";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.healthfragment, null);

        recyclerViewofhealth = v.findViewById(R.id.recyclerviewofhealth);
        APIMainArrayList = new ArrayList<>();
        recyclerViewofhealth.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(), APIMainArrayList);
        recyclerViewofhealth.setAdapter(adapter);

        findNews();


        return v;
    }

    private void findNews() {
        ApiUtilities.getApiInterface().getCategoryNews(country, category, 100, api).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Call<mainNews> call, Response<mainNews> response) {

            }

            @Override
            public void onFailure(Call<mainNews> call, Throwable t) {

            }
        });
    }
}
