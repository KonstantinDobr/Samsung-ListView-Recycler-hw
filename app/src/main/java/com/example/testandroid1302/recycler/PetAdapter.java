package com.example.testandroid1302.recycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testandroid1302.databinding.ItemPetBinding;
import com.example.testandroid1302.domain.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetAdapter extends RecyclerView.Adapter<PetViewHolder> {

    private List<Pet> petList;

    private PetClickListener listener;

    public PetAdapter(List<Pet> petList, PetClickListener listener) {
        this.petList = petList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPetBinding binding = ItemPetBinding.inflate(
                LayoutInflater.from(
                        parent.getContext()
                )
        );
        return new PetViewHolder(binding, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {
        holder.bind(petList.get(position));
    }

    @Override
    public int getItemCount() {
        return petList.size();
    }

    public void setPetList(List<Pet> petList) {
        this.petList = new ArrayList<>(petList);
        notifyDataSetChanged();
    }
}
