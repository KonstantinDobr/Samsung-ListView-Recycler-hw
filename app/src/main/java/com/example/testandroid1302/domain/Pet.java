package com.example.testandroid1302.domain;

public class Pet {
    private String name;
    private String imgUrl;
    private String breed;

    public Pet(String name, String imgUrl, String breed) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
