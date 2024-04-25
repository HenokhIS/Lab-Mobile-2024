package com.example.h071221045_tuprak5;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams =generateDummyInstagram();

    private static ArrayList<Instagram> generateDummyInstagram() {
        ArrayList<Instagram> instagramadd = new ArrayList<>();
        instagramadd.add(new Instagram("henokh", "Henokh Abhinaya Tjahjadi", "Test Upload"
                ,R.drawable.upload, R.drawable.upload));

        instagramadd.add(new Instagram("tes1", "Ini Tes 1", "Foto Tes 1"
                ,R.drawable.teshijau, R.drawable.teshijau));

        instagramadd.add(new Instagram("tes2", "Ini Tes 2", "Foto Tes 2"
                ,R.drawable.tesbiru, R.drawable.tesbiru));

        instagramadd.add(new Instagram("tes3", "Ini Tes 3", "Foto Tes 3"
                ,R.drawable.tesmerah, R.drawable.tesmerah));

        return instagramadd;

    }

}
