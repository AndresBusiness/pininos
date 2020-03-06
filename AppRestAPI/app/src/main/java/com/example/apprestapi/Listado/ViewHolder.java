package com.example.apprestapi.Listado;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.apprestapi.R;


import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
//REALIZA LA REFERENCIA DE LOS ELEMENTOS DE LA CELDA CON LAS VARIABLES

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView txtNombre, txtCorreo, txtTelefono;
    public AppCompatImageView imgUser;
    public ProgressBar loading;
    public ViewHolder(View view) {
        super(view);

        txtNombre = (TextView) view.findViewById(R.id.txtNombre);
        txtCorreo = (TextView) view.findViewById(R.id.txtCorreo);
        txtTelefono = (TextView) view.findViewById(R.id.txtTelefono);
        imgUser = (AppCompatImageView)view.findViewById( R.id.imgUser );
        loading  = (ProgressBar)view.findViewById(R.id.pbLoadingImg);
    }
}