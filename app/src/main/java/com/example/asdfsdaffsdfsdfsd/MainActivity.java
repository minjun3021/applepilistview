package com.example.asdfsdaffsdfsdfsd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Item> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        list=new ArrayList<>();
        list.add(new Item("Hello","iam minjun"));
        list.add(new Item("Hello","iam asdf"));
        list.add(new Item("Hello","iam qwer"));
        list.add(new Item("Hello","iam zxcv"));

        MyAdapter adapter=new MyAdapter(getApplicationContext(),list,R.layout.item);
        listView.setAdapter(adapter);


    }
}
