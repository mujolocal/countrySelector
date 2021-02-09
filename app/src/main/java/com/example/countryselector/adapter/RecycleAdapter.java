package com.example.countryselector.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.countryselector.databinding.RecycleItemBinding;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.AdapterViewHolder> {
    private ArrayList<String> strings;
    public RecycleAdapter(ArrayList<String> strings){
        this.strings = strings;

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
        holder.setLayout(strings.get(position));
    }


    @Override
    public int getItemCount() {
        return strings.size();
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
