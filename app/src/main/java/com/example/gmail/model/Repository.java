package com.example.gmail.model;

import com.example.gmail.R;

import java.util.ArrayList;

public class Repository {
    public static ArrayList<Email> getEmails() {
        ArrayList<Email> res = new ArrayList<Email>();
        res.add( new Email(R.drawable.download, "Hoang","11:50 PM", "Hello", true));
        res.add( new Email(R.drawable.download, "Hoang","11:51 PM", "Hello", false));
        res.add( new Email(R.drawable.download, "Hoang","11:52 PM", "Hello", true));
        res.add( new Email(R.drawable.download, "Hoang","11:53 PM", "Hello", false));
        res.add( new Email(R.drawable.download, "Hoang","11:54 PM", "Hello", true));

        return res;
    }
}
