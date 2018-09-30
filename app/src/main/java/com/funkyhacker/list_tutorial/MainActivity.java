package com.funkyhacker.list_tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

     private RecyclerView mRecyclerView;
     private RecyclerView.Adapter mAdapter;
     private RecyclerView.LayoutManager mLayoutManager;

//     private String[] myDataset = new String[20];
//     private String[] myDataset2 = new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

//        myDataset[0] = "ken";
//        myDataset[1] = "ai";
//        myDataset[2] = "yuta";
//        myDataset[3] = "megu";
//        myDataset[4] = "syou";
//        myDataset[5] = "saki";
//        myDataset[6] = "tetsu";
//        myDataset[7] = "mai";
//        myDataset[8] = "tarou";
//        myDataset[9] = "hanako";
//        myDataset[10] = "jiro";
//        myDataset[11] = "saki";
//        myDataset[12] = "tomoya";
//        myDataset[13] = "ayaka";
//        myDataset[14] = "syuji";
//        myDataset[15] = "momoko";
//        myDataset[16] = "koji";
//        myDataset[17] = "yuri";
//        myDataset[18] = "jyoji";
//        myDataset[19] = "kazu";
//
//        myDataset2[0] = "こんにちは";
//        myDataset2[1] = "よう";
//        myDataset2[2] = "やっほー";
//        myDataset2[3] = "元気？";
//        myDataset2[4] = "あのさー";
//        myDataset2[5] = "マジ？";
//        myDataset2[6] = "えー！";
//        myDataset2[7] = "そうなん";
//        myDataset2[8] = "すごいね";
//        myDataset2[9] = "あるある";
//        myDataset2[10] = "いやないよ";
//        myDataset2[11] = "こんばんは";
//        myDataset2[12] = "元気でね";
//        myDataset2[13] = "うんうん";
//        myDataset2[14] = "まいった";
//        myDataset2[15] = "ほんとに？";
//        myDataset2[16] = "嘘だー";
//        myDataset2[17] = "やるやる";
//        myDataset2[18] = "できない？";
//        myDataset2[19] = "もうええわ";





        Item item0 = new Item("ken","00","こんにちは");
        Item item1 = new Item("ai","01","よう");
        Item item2 = new Item("yuta","02","やっほー");
        Item item3 = new Item("megu","03","元気？");
        Item item4 = new Item("syou","04","あのさー");
        Item item5 = new Item("saki","05","マジ？");
        Item item6 = new Item("fetsu" ,"06","えー");
        Item item7 = new Item("mai","07","そうなん");
        Item item8 = new Item("tarou","08","すごいね");
        Item item9 = new Item("hanako","09","あるある");
        Item item10 = new Item("jiro","10","ないよ");
        Item item11 = new Item("saki","11","こんばんわ");
        Item item12 = new Item("tomoya","12","元気で");
        Item item13 = new Item("ayaka","13","うんうん");
        Item item14 = new Item("syuji","14","まいった");
        Item item15 = new Item("momoko","15","ほんと？");
        Item item16 = new Item("koji","16","うそだ");
        Item item17 = new Item("yuri","17","やるやる");
        Item item18 = new Item("jyoji","18","できない");
        Item item19 = new Item("kazu","19","おはよう");


        ArrayList<Item> myList = new ArrayList<Item>();

        myList.add(item0);
        myList.add(item1);
        myList.add(item2);
        myList.add(item3);
        myList.add(item4);
        myList.add(item5);
        myList.add(item6);
        myList.add(item7);
        myList.add(item8);
        myList.add(item9);
        myList.add(item10);
        myList.add(item11);
        myList.add(item12);
        myList.add(item13);
        myList.add(item14);
        myList.add(item15);
        myList.add(item16);
        myList.add(item17);
        myList.add(item18);
        myList.add(item19);


        mAdapter = new MyAdapter(myList);



        mRecyclerView.setAdapter(mAdapter);

        RecyclerView.ItemDecoration itemDecoration =
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(itemDecoration);
    }

}
