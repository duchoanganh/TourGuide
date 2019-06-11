package com.example.tourguide;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HotelFragment extends Fragment {
    ListView lvHt;
    ArrayList<Item> arrayItem;
    CustomAdapter adapter;
    ActionBar actionbar;
    TextView textview;
    LinearLayout.LayoutParams layoutparams;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_hotel, container, false);
        ActionBarTitleGravity();
        lvHt = (ListView) view.findViewById(R.id.lvHotel);
        initData();
        adapter = new CustomAdapter(getActivity(),R.layout.list_item,arrayItem);
        lvHt.setAdapter(adapter);
        return view;

    }

    private void ActionBarTitleGravity() {
        actionbar = ((AppCompatActivity) getActivity()).getSupportActionBar();

        textview = new TextView(getContext());

        layoutparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        textview.setLayoutParams(layoutparams);

        textview.setText("Khách Sạn");

        textview.setTypeface(null, Typeface.BOLD);

        textview.setTextColor(Color.WHITE);

        textview.setGravity(Gravity.CENTER);

        textview.setTextSize(15);

        actionbar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        actionbar.setCustomView(textview);
    }

    private void initData() {
        arrayItem = new ArrayList<>();
        arrayItem.add(new Item("The Queen Hotel & Spa","67 Thuốc Bắc,Hàng Bồ,Hàng Bồ,Quận Hoàn Kiếm,Hà Nội,Việt Nam",R.drawable.hotelicon,R.color.colorItemHotel));
        arrayItem.add(new Item("Hanoi Nostalgia Hotel & Spa","13-15 Luong Ngoc Quyen, Hang Buom, Hoan Kiem, Hàng Buồm, Quận Hoàn Kiếm, Hà Nội, Việt Nam",R.drawable.hotelicon,R.color.colorItemHotel));
        arrayItem.add(new Item("Church Legend Hotel Hanoi","46 Ấu Triệu, Phường Hàng Trống, Quận Hoàn Kiếm, Hà Nội, Việt Nam",R.drawable.hotelicon,R.color.colorItemHotel));
        arrayItem.add(new Item("Little Hanoi Diamond Hotel","11 Bát Đàn, Quận Hoàn Kiếm, Hàng Bồ, Quận Hoàn Kiếm, Hà Nội, Việt Nam",R.drawable.hotelicon,R.color.colorItemHotel));
        arrayItem.add(new Item("Flamingo Dai Lai Resort","Thôn Ngọc Quang, Xã Ngọc Thanh, Vĩnh Phúc, Phúc Yên, Hà Nội, Việt Nam",R.drawable.hotelicon,R.color.colorItemHotel));
        arrayItem.add(new Item("Annam Legend Hotel","27 Hàng Bè, Hàng Bạc, Quận Hoàn Kiếm, Hà Nội, Việt Nam",R.drawable.hotelicon,R.color.colorItemHotel));
        arrayItem.add(new Item("Hanoi Zesty Hotel","20 Hàng Cân, Hàng Đào, Quận Hoàn Kiếm, Hà Nội, Việt Nam",R.drawable.hotelicon,R.color.colorItemHotel));
        arrayItem.add(new Item("Bluebell Hotel","41 Ngõ Huyện, Phường Hàng Trống, Quận Hoàn Kiếm, Hà Nội, Việt Nam",R.drawable.hotelicon,R.color.colorItemHotel));
    }

}