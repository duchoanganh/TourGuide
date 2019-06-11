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

public class ATMFragment extends Fragment {
    ListView lvATM;
    ArrayList<Item> arrayItem;
    CustomAdapter adapter;
    ActionBar actionbar;
    TextView textview;
    LinearLayout.LayoutParams layoutparams;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_atm, container, false);
        ActionBarTitleGravity();
        lvATM =(ListView)view.findViewById(R.id.lvAtm);
        initData();
        adapter = new CustomAdapter(getActivity(),R.layout.list_item,arrayItem);
        lvATM.setAdapter(adapter);
        return view;
    }

    private void ActionBarTitleGravity() {
        actionbar = ((AppCompatActivity) getActivity()).getSupportActionBar();

        textview = new TextView(getContext());

        layoutparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        textview.setLayoutParams(layoutparams);

        textview.setText("ATM");

        textview.setTypeface(null, Typeface.BOLD);

        textview.setTextColor(Color.WHITE);

        textview.setGravity(Gravity.CENTER);

        textview.setTextSize(15);

        actionbar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        actionbar.setCustomView(textview);

    }

    private void initData(){
        arrayItem = new ArrayList<>();
        arrayItem.add(new Item("ATM Hoàn Kiếm","17 phố Lý Thường Kiệt, Phường Phan Chu Trinh, Quận Hoàn Kiếm, Hà Nội",R.drawable.atm_machineicon,R.color.colorItemATM));
        arrayItem.add(new Item("ATM Đinh Tiên Hoàng","7 Đinh Tiên Hoàng, Quận Hoàn Kiếm, Hà Nội",R.drawable.atm_machineicon,R.color.colorItemATM));
        arrayItem.add(new Item("ATM Hội sở","57 Lý Thường Kiệt, Quận Hoàn Kiếm, Hà Nội",R.drawable.atm_machineicon,R.color.colorItemATM));
        arrayItem.add(new Item("ATM Nam Hà Nội","236 Lê Thanh Nghị, Quận Hai Bà Trưng, Hà Nội",R.drawable.atm_machineicon,R.color.colorItemATM));
        arrayItem.add(new Item("ATM Hai Bà Trưng","300-302 Trần Khát Chân, Quận Hai Bà Trưng, Hà Nội",R.drawable.atm_machineicon,R.color.colorItemATM));
        arrayItem.add(new Item("ATM Lê Ngọc Hân","44 Lê Ngọc Hân, Quận Hai Bà Trưng, Hà Nội",R.drawable.atm_machineicon,R.color.colorItemATM));
        arrayItem.add(new Item("ATM Thăng Long","129-131 Hoàng Quốc Việt, Quận Cầu Giấy, Hà Nội",R.drawable.atm_machineicon,R.color.colorItemATM));
        arrayItem.add(new Item("ATM Phạm Hùng","Tòa nhà FPT Phạm Hùng, Quận Cầu Giấy, Hà Nội",R.drawable.atm_machineicon,R.color.colorItemATM));
        arrayItem.add(new Item("ATM Khâm Thiên","158 Khâm Thiên, Quận Đống Đa, Hà Nội",R.drawable.atm_machineicon,R.color.colorItemATM));

    }
}
