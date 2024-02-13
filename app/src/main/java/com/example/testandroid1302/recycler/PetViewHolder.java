package com.example.testandroid1302.recycler;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testandroid1302.databinding.ItemPetBinding;
import com.example.testandroid1302.domain.Pet;

public class PetViewHolder extends RecyclerView.ViewHolder {

    private ItemPetBinding binding;

    private PetClickListener clickListener;

    public PetViewHolder(ItemPetBinding binding, PetClickListener clickListener) {
        super(binding.getRoot());
        this.binding = binding;
        this.clickListener = clickListener;
    }

    public void bind(Pet item) {
        // binding.ivImg.setImageResource(item.getImgUrl());
        binding.tvBreed.setText(item.getBreed());
        binding.tvName.setText(item.getName());
        binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onClick(item);
            }
        });
    }
}
