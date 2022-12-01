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
public class HomeFragment extends Fragment {

//we need a array list

    String api="e48c158b1c884e0b9f1d80ddaeff2c09";
    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;
    String country="in";  // in is india country news in api
    private RecyclerView recyclerViewofhome;


    //inside this we have to impliment override methods (Alt+insert--override methode--OnCreateView)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //inside this we have to attach our fragments
        //The inflate () function of the Inflater class is used to uncompress the input data and fill the given buffer with the uncompressed data. The function returns the number of bytes of the uncompressed data.
        View v=inflater.inflate(R.layout.homefragment,null);

//we have assign the xml id to our java id
        recyclerViewofhome=v.findViewById(R.id.recyclerviewofhome);
        modelClassArrayList=new ArrayList<>(); //we need take the list of model class
        recyclerViewofhome.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new Adapter(getContext(),modelClassArrayList);//we need take our adapter and pass two things one getcontext and 2nd list which we get when we call our retrofit instence
        recyclerViewofhome.setAdapter(adapter);// we set this adapter on our recycler view ,which will set all the data
        
        findNews();//this fuction is to find news which will fetch all the news


        return v;
    }
//below code is mainly to fetch data from the api
    private void findNews() {
        //enqueue(Callback<T> callback) Asynchronously send the request and notify callback of its response or if an error occurred talking to the server, creating the request, or processing the response.
        //pagesize 100 is to get 100 news in a fragment
        ApiUtilites.getApiInterface(ApiInterface.BASE_URL).getNews(country,100,api).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
                if(response.isSuccessful())
                {
                    modelClassArrayList.addAll(response.body().getArticles()); // if we get the response successful we add all our array inside our array list
                    adapter.notifyDataSetChanged();//we need notify the array adapter

                }
            }

            @Override
            public void onFailure(Call<mainNews> call, Throwable t) {

            }
        });
    }
}
