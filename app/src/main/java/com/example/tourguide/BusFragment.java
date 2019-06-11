package com.example.tourguide;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BusFragment extends Fragment {
    ListView lvBus;
    ArrayList<Item> arrayItem;
    CustomAdapter adapter;
    ActionBar actionbar;
    TextView textview;
    LinearLayout.LayoutParams layoutparams;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
         View view = inflater.inflate(R.layout.fragment_bus,container,false);
        ActionBarTitleGravity();
         lvBus =(ListView)view.findViewById(R.id.lvBus);
         initData();
         adapter = new CustomAdapter(getActivity(),R.layout.list_item,arrayItem);
         lvBus.setAdapter(adapter);
         return view;
    }

    private void ActionBarTitleGravity() {
        actionbar = ((AppCompatActivity) getActivity()).getSupportActionBar();

        textview = new TextView(getContext());

        layoutparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        textview.setLayoutParams(layoutparams);

        textview.setText("Xe Bus");

        textview.setTypeface(null, Typeface.BOLD);

        textview.setTextColor(Color.WHITE);

        textview.setGravity(Gravity.CENTER);

        textview.setTextSize(15);

        actionbar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        actionbar.setCustomView(textview);
    }

    private void initData(){
        arrayItem = new ArrayList<>();
        arrayItem.add(new Item("Tuyến 01","BX Gia Lâm - BX Yên Nghĩa",R.drawable.metroicon,R.color.colorItemBus ));
        arrayItem.add(new Item("Tuyến 02","Bác cổ - BX Yên Nghĩa",R.drawable.metroicon,R.color.colorItemBus));
        arrayItem.add(new Item("Tuyến 03A","BX Giáp Bát - BX Gia Lâm",R.drawable.metroicon,R.color.colorItemBus));
        arrayItem.add(new Item("Tuyến 03B","Bx Giáp Bát - Vincom - Phúc Lợi",R.drawable.metroicon,R.color.colorItemBus));
        arrayItem.add(new Item("Tuyến 04","Long Biên - BX Nước Ngầm",R.drawable.metroicon,R.color.colorItemBus));
        arrayItem.add(new Item("Tuyến 05","Linh Đàm - Phú Diễn",R.drawable.metroicon,R.color.colorItemBus));
        arrayItem.add(new Item("Tuyến 06","BX. Giáp Bát - Phú Minh (Phú Xuyên)",R.drawable.metroicon,R.color.colorItemBus));
        arrayItem.add(new Item("Tuyến 01","Cầu Giấy - Nội Bài",R.drawable.metroicon,R.color.colorItemBus));
        arrayItem.add(new Item("Tuyến 08","Long Biên - Đông Mỹ",R.drawable.metroicon,R.color.colorItemBus));
    }
}
