package com.example.ignas.doberdek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class mainas extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "Crate for me",
            "Crate for you and me",
            "Crate for 3 + me",
    };

    Integer[] imgid={
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainas);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list =(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                if (Slecteditem == "Crate for me")
                {
                Intent justme = new Intent(mainas.this, JustMe.class);
                startActivity(justme);

                }
                else if (Slecteditem == "Crate for you and me")
                {
                    Intent me1 = new Intent(mainas.this, Me1.class);
                    startActivity(me1);
                }
                else if (Slecteditem == "Crate for 3 + me")
                {
                    Intent me3 = new Intent(mainas.this, Me3.class);
                    startActivity(me3);
                }

            }
        });
    }
    }

