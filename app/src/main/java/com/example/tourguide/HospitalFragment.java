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

public class HospitalFragment extends Fragment {
    ListView lvHospital;
    ArrayList<Item> arrayItem;
    CustomAdapter adapter;
    ActionBar actionbar;
    TextView textview;
    LinearLayout.LayoutParams layoutparams;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
         View view = inflater.inflate(R.layout.fragment_hospital,container,false);
         ActionBarTitleGravity();
         lvHospital =(ListView)view.findViewById(R.id.lvHospital);
         initData();
         adapter = new CustomAdapter(getActivity(),R.layout.list_item,arrayItem);
         lvHospital.setAdapter(adapter);
         return view;
    }


        private void ActionBarTitleGravity() {
            actionbar = ((AppCompatActivity) getActivity()).getSupportActionBar();

            textview = new TextView(getContext());

            layoutparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            textview.setLayoutParams(layoutparams);

            textview.setText("Bệnh Viện");

            textview.setTypeface(null, Typeface.BOLD);

            textview.setTextColor(Color.WHITE);

            textview.setGravity(Gravity.CENTER);

            textview.setTextSize(15);

            actionbar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

            actionbar.setCustomView(textview);
    }

    private void initData(){
        arrayItem = new ArrayList<>();
        arrayItem.add(new Item("Bệnh viện Bạch Mai","78 – Đường Giải Phóng – Phương Mai – Đống Đa – Hà Nội",R.drawable.hospitalicon,R.color.colorItemHospital));
        arrayItem.add(new Item("Bệnh Viện Hữu Nghị","Số 1 – Trần Khánh Dư – Quận Hai Bà Trưng – Hà Nội",R.drawable.hospitalicon,R.color.colorItemHospital));
        arrayItem.add(new Item("Bệnh Viện E, Hà Nội","89 – Trần Cung – Nghĩa Tân – Cầu Giấy – Hà Nội",R.drawable.hospitalicon,R.color.colorItemHospital));
        arrayItem.add(new Item("Viện Răng Hàm Mặt","40B – Tràng Thi – Hoàn Kiếm – Hà Nội",R.drawable.hospitalicon,R.color.colorItemHospital));
        arrayItem.add(new Item("Bệnh Viện Tai Mũi Họng Trung Ương","78 – Đường Giải Phóng – Quận Đống Đa – Hà Nội",R.drawable.hospitalicon,R.color.colorItemHospital));
        arrayItem.add(new Item("Bệnh Viện Mắt Trung Ương","85 – Phố Bà Triệu – Quận Hai Bà Trưng – Hà Nội",R.drawable.hospitalicon,R.color.colorItemHospital));
        arrayItem.add(new Item("Viện Y Học Cổ Truyền Trung Ương","29 – Phố Nguyễn Bỉnh Khiêm – Quận Hai Bà Trưng – Hà Nội",R.drawable.hospitalicon,R.color.colorItemHospital));
        arrayItem.add(new Item("Bệnh Viện Nội Tiết","80 – Thái Thịnh II – Thịnh Quang – Đống Đa – Hà Nội",R.drawable.hospitalicon,R.color.colorItemHospital));
        arrayItem.add(new Item("Bệnh Viện Việt Đức","8 – Phố Phủ Doãn – Quận Hoàn Kiếm – Hà Nội",R.drawable.hospitalicon,R.color.colorItemHospital));
        arrayItem.add(new Item("Bệnh Viện Nhi Trung Ương","18/879 – Đường La Thành – Quận Đống Đa – Hà Nội",R.drawable.hospitalicon,R.color.colorItemHospital));
    }
}
