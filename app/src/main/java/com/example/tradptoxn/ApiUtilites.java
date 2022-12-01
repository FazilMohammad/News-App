package com.example.tradptoxn;
//this class to create the utilites for retrofit object
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
//
public class ApiUtilites {
//inside this we need to take a retrofit object
 //we need to make sure to have retrofit dependency in Gradle
 private static Retrofit retrofit=null;

//first we to create a api interface


 public static ApiInterface getApiInterface(String URL)
 {

  if(retrofit==null) //"==" we haven't created the object of retrofit till now so we have to create this
  {

   //Builder() function stacked like building blocks
   //addConverterFactory method is used when Converting a fragment
   //GsonConverterFactory--A converter which uses Gson for JSON.
   retrofit=new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create())
           .build();
  }
  return retrofit.create(ApiInterface.class);

 }

}
