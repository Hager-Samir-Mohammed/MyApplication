package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler1 , recycler2 , recycler3 , recycler4;
    List <SUPER_Book_Fair> super_book_fairList;

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler1 = findViewById(R.id.RV_1);
//        recycler2 = findViewById(R.id.RV_2);
//        recycler3 = findViewById(R.id.RV_3);
//        recycler4 = findViewById(R.id.RV_4);


        super_book_fairList.add(new SUPER_Book_Fair(R.drawable.book_interface3));
        super_book_fairList.add(new SUPER_Book_Fair(R.drawable.book_interface2));
        super_book_fairList.add(new SUPER_Book_Fair(R.drawable.book_interface));



//        RecyclerView.LayoutManager LM = new LinearLayoutManager(this);
            LinearLayoutManager M = new LinearLayoutManager(this);
            M.setOrientation(LinearLayoutManager.HORIZONTAL);
            recycler1.setLayoutManager(M);

            RV_Adapter adapter = new RV_Adapter(this , super_book_fairList);
            recycler1.setAdapter(adapter);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(LM);
//        recyclerView.setAdapter(adapter);

    }
}