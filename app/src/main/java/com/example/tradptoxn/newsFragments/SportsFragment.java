package com.example.tradptoxn.newsFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tradptoxn.Adapter;
import com.example.tradptoxn.ApiInterface;
import com.example.tradptoxn.ApiUtilites;
import com.example.tradptoxn.ModelClass;
import com.example.tradptoxn.R;
import com.example.tradptoxn.mainNews;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//extends here is used because An extended Application class can declare global variables.
//we need to create a Model class to handle this Fragments (so we need Fragment androidx.fragment.app import statement here)
public class SportsFragment extends Fragment {

    String api="e48c158b1c884e0b9f1d80ddaeff2c09";
    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;
    String country="in";
    private RecyclerView recyclerViewofsports;
    private String category="sports";

    //inside this we have to impliment override methods (Alt+insert--override methode--OnCreateView)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //inside this we have to attach our fragments
        //The inflate () function of the Inflater class is used to uncompress the input data and fill the given buffer with the uncompressed data. The function returns the number of bytes of the uncompressed data.
        View v=inflater.inflate(R.layout.sportsfragment,null);

        recyclerViewofsports=v.findViewById(R.id.recyclerviewfsports);
        modelClassArrayList=new ArrayList<>();
        recyclerViewofsports.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new Adapter(getContext(),modelClassArrayList);
        recyclerViewofsports.setAdapter(adapter);

        findNews();


        return v;
    }

    private void findNews() {
        ApiUtilites.getApiInterface(ApiInterface.BASE_URL).getCategoryNews(country,category,100,api).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
                if(response.isSuccessful())
                {
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<mainNews> call, Throwable t) {

            }
        });
    }
}

