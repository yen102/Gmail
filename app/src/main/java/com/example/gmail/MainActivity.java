package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.gmail.model.Email;
import com.example.gmail.model.Repository;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    EmailAdapter emailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<Email> emails = Repository.getEmails();
        emailAdapter = new EmailAdapter(emails);
        recyclerView.setAdapter(emailAdapter);
    }
}