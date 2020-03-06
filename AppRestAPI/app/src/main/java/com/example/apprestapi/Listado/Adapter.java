package com.example.apprestapi.Listado;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apprestapi.R;
import com.example.apprestapi.Modelo.users;
import com.example.apprestapi.Shared;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    //DECLARACION DE LAS VARIABLES
    private List<users> list;
    private final Context context;

    //CONSTRUCTOR QUE RECIBE LOS VALORES DE LA INSTANCIA
    public Adapter(List<users> list, Context contexto) {
        this.list = list;
        this.context = contexto;
    }


    //REALIZA LA REFERENCIA DE LA CELDA Y LA DEVUELVE EN UNA VISTA POR CADA ITEM
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_content, parent, false);

        return new ViewHolder(itemView);
    }

    //ESTA FUNCION RECIBE CADA ITEM DE LA LISTA PARA ASIGNARSELA A LOS ELEMENTOS DE LA CELDA
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        users info = list.get(position);
        holder.txtNombre.setText(info.getNombre());
        holder.txtCorreo.setText(info.getCorreo());
        holder.txtTelefono.setText(info.getTelefono());
        Shared.cargarImgGlide(Uri.parse(info.getImg()),holder.imgUser, context, holder.loading );
    }

    //RECUPERA EL TAMAÑO DE LA LISTA
    @Override
    public int getItemCount() {
        return list.size();
    }

}


