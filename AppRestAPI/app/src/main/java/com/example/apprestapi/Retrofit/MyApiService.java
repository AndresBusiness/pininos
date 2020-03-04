package com.example.apprestapi.Retrofit;

import com.example.apprestapi.Retrofit.response.userResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Andres on 19/05/2018.
 */

//EN ESTA INTERFAZ ES DONDE SE GENERAN LAS FUNCIONES DEL SERVICIO
public interface MyApiService {


    @GET("cgBKwJkQya?indent=2")
    Call<userResponse[]> getUsers();


/*

  @FormUrlEncoded
    @POST("GetVerificacion")
    Call<getResponse> getInfoVotosxPartidos(
            @Field("IDUBICACION") int IDUBICACION,
            @Field("IDELECCION")  int IDELECCION,
            @Field("TIPOCASILLA") String TIPOCASILLA,
            @Field("SECCION")     int SECCION,
            @Field("IDCASILLA")   int IDCASILLA,
            @Field("IDUSUARIO")   int IDUSUARIO
    );


    @FormUrlEncoded
    @POST("UpdateCotejo")
    Call<updateResponse> updateCotejo(
            @Field("IDUBICACION")             int IDUBICACION,
            @Field("IDELECCION")              int IDELECCION,
            @Field("TIPOCASILLA")             String TIPOCASILLA,
            @Field("SECCION")                 int SECCION,
            @Field("COTEJADO")                boolean COTEJADO,
            @Field("IDUSUARIO")               int IDUSUARIO,
            @Field("FECHAHORA_INICIOCOTEJO")  String FECHAHORA_INICIOCOTEJO,
            @Field("IDCASILLA")               int IDCASILLA,
            @Field("IDTIPODOCUMENTO")         int IDTIPODOCUMENTO

    );

    @FormUrlEncoded
    @POST("upload/photo")
    Call<SimpleResponse> postPhoto(
            @Field("image") String base64,
            @Field("extension") String extension,
            @Field("user_id") String user_id
    );

    @GET("login")
    Call<LoginResponse> getLogin(
            @Query("username") String username,
            @Query("password") String password
    );

    @FormUrlEncoded
    @POST("product")
    Call<SimpleResponse> postNewProduct(
            @Field("code") String code,
            @Field("name") String name,
            @Field("description") String description
    );
*/
}