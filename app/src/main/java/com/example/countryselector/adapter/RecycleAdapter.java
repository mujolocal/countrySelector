package com.example.countryselector.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.countryselector.databinding.RecycleItemBinding;
import com.example.countryselector.model.CountryInfo;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.AdapterViewHolder> {
    private ArrayList<CountryInfo> countries;
    public RecycleAdapter(ArrayList<CountryInfo> countries){
        this.countries = countries;

    }
    public void setCountries(ArrayList<CountryInfo> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecycleItemBinding recycleItemBinding = RecycleItemBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new AdapterViewHolder(recycleItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.AdapterViewHolder holder, int position) {
        holder.setLayout(countries.get(position).getName());
    }


    @Override
    public int getItemCount() {
        return countries.size();
    }

    class AdapterViewHolder extends RecyclerView.ViewHolder{
        private final RecycleItemBinding binding;

        public AdapterViewHolder(@NonNull RecycleItemBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;

        }
        public void  setLayout(String string){
            binding.txt.setText( string);
        }
    }

}
