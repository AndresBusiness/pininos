package com.example.apprestapi;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

import androidx.annotation.Nullable;

public class Shared {

    public static final int ANIM_DURATION_TITLETOOLBAR = 300;
    public static final int ANIM_DURATION_FAB = 400;

    public static void cargarImgGlide(Uri uri, ImageView img, Context context, ProgressBar loading) {
        final RequestOptions opciones = new RequestOptions()
                .diskCacheStrategy( DiskCacheStrategy.ALL )
                .error(R.drawable.sin_imagen);

        Glide.with( context )
                .load(uri)
                .apply( opciones )
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        Animation fadeInAnimation = AnimationUtils.loadAnimation(context, R.anim.fadein);
                        img.startAnimation(fadeInAnimation);
                        loading.setVisibility( View.GONE );
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        Animation fadeInAnimation = AnimationUtils.loadAnimation(context, R.anim.fadein);
                        img.startAnimation(fadeInAnimation);
                        loading.setVisibility( View.GONE );
                        return false;
                    }
                })
                .into(img);
    }

    public String suma(String num1, String num2){
        int resultado  = Integer.valueOf(num1) + Integer.valueOf(num2);
        return String.valueOf(resultado);
    }

    public String resta(String num1, String num2){
        int resultado  = Integer.valueOf(num1) - Integer.valueOf(num2);
        return String.valueOf(resultado);
    }

}
