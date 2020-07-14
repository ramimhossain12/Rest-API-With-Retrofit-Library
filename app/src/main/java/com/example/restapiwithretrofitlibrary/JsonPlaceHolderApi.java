package com.example.restapiwithretrofitlibrary;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolderApi {


    @GET("posts")
     Call<List<Post>> getPost(@Query("userId") Integer[] userId,
                              @Query("_sort") String sort,
                              @Query("order") String order


    );

    @GET("posts")
    Call<List<Post>> getPost(
            @QueryMap Map<String,String> parameters);



    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int PostId);

    @GET
    Call<List<Comment>>  getComments(@Url String url);

    @POST("posts")
   Call<Post> createPost(@Body Post post);

    @FormUrlEncoded
    @POST("posts")
    Call<Post> cretePost(

            @Field("userID") int userId,
            @Field("title") String title,
            @Field("body") String text



    );


    @FormUrlEncoded
    @POST("posts")
    Call<Post> createPost(@FieldMap Map<String,String> field);
}
