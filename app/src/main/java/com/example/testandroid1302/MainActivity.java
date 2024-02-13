package com.example.testandroid1302;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.example.testandroid1302.databinding.ActivityMainBinding;
import com.example.testandroid1302.domain.Person;
import com.example.testandroid1302.domain.Pet;
import com.example.testandroid1302.listadapter.PersonAdapter;
import com.example.testandroid1302.recycler.PetAdapter;
import com.example.testandroid1302.recycler.PetClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private List<Person> personList;
    private List<Pet> petList_local;

    private List<Pet> petList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init_petList_local();
        init_personList();
        init_petList();

        PersonAdapter personAdapter = new PersonAdapter(this, personList);
        binding.lvPersons.setAdapter(personAdapter);

        PetAdapter petAdapter = new PetAdapter(petList, new PetClickListener() {
            @Override
            public void onClick(Pet pet) {
                Toast.makeText(MainActivity.this, pet.toString(), Toast.LENGTH_LONG).show();
            }
        });

        binding.rvPet.setAdapter(petAdapter);

    }


    private void init_personList() {
        personList = new ArrayList<>();
        for (int id = 0; id <= 49; id++) {
            personList.add(new Person(id, "Имя " + id, String.valueOf(id * 1000), petList_local));
        }
    }

    private void init_petList_local() {
        petList_local = new ArrayList<>();
        for (int id = 0; id <= 4; id++) {
            petList_local.add(new Pet("Питомец " + id, "Питомец " + id, "Порода " + id));
        }
    }

    private void init_petList() {
        petList = new ArrayList<>();
        for (Person person : personList) {
            for (Pet pet : person.getPets()) {
                petList.add(pet);
            }
        }
    }
}