package com.example.h071221045_tuprak4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> accounts = AccountTest();

    private static ArrayList<Instagram> AccountTest() {
        ArrayList<Instagram> accounts1 = new ArrayList<>();
        accounts1.add(new Instagram("test.console","Console Test"
                ,"background console"
                ,R.drawable.game_profile,R.drawable.game_profile));

        accounts1.add(new Instagram("blue", "Biru"
                ,"biru yang unik"
                ,R.drawable.biru_post,R.drawable.biru_post));

        accounts1.add(new Instagram("cars.expert", "Car Poster"
                ,"Mobil di tengah jalan"
                ,R.drawable.car_post, R.drawable.car_post));

        accounts1.add((new Instagram("jajan.mantap","Jajan Jajan"
                ,"makanan siang hari ini"
                ,R.drawable.food_post,R.drawable.food_post)));

        accounts1.add(new Instagram("moon_watch", "Bulan Bersinar"
                ,"kondisi bulan saat ini"
                ,R.drawable.moon_post,R.drawable.moon_post));
        return accounts1;
    }
}
