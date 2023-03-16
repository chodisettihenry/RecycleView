package com.example.recycleviewexample;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class ReclycleAdapter extends RecyclerView.Adapter<ReclycleAdapter.CountryviewHolder>{
    private ArrayList<String> CountryList;
    private ArrayList<String>  Descripictionlist;
    private ArrayList<Integer>  ImageList;
    private Context context;

    public ReclycleAdapter(ArrayList<String> countryList, ArrayList<String> descripictionlist, ArrayList<Integer> imageList, Context context) {
        CountryList = countryList;
        Descripictionlist = descripictionlist;
        ImageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View View= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);;
        return new CountryviewHolder(View);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull CountryviewHolder holder, int position) {

        holder.textViewtitle.setText(CountryList.get(position));
        holder.textViewdescription.setText(Descripictionlist.get(position));
        holder.image.setImageResource(ImageList.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){
                    Toast.makeText(context, "haaa we are Indians", Toast.LENGTH_SHORT).show();

                }
                else if(position==1){

                    Toast.makeText(context, "Haa we are Englands", Toast.LENGTH_SHORT).show();
                } else if(position==2){

                    Toast.makeText(context, "haa we are Germany's", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }

    @Override
    public int getItemCount() {
        return CountryList.size();
    }

    public class CountryviewHolder extends RecyclerView.ViewHolder {
        TextView textViewtitle,textViewdescription;
        ImageView image;
        CardView cardView;

        public CountryviewHolder(@NonNull View itemView) {
            super(itemView);

            textViewtitle = itemView.findViewById(R.id.TextViewTitle);
            textViewdescription = itemView.findViewById(R.id.textViewDescripiction);
            image = itemView.findViewById(R.id.profile_image);
            cardView = itemView.findViewById(R.id.cardviewresult);
        }
    }
}
