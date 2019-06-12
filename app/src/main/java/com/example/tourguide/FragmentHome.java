package com.example.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FragmentHome extends Fragment {
    LinearLayout llKs;
    LinearLayout llBv;
    LinearLayout llAtm;
    LinearLayout llBus;
    FragmentManager fm;
    ActionBar actionBar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        final View view = inflater.inflate(R.layout.fragment_home, container, false);

        ActionBarTitleGravity();

        fm = getActivity().getSupportFragmentManager();
        final FragmentTransaction ft = fm.beginTransaction();
        llKs = (LinearLayout) view.findViewById(R.id.ll_ks);
        llBv = (LinearLayout) view.findViewById(R.id.ll_bv);
        llBus = (LinearLayout) view.findViewById(R.id.ll_bus);
        llAtm = (LinearLayout) view.findViewById(R.id.ll_atm);
        llKs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft.replace(R.id.main, new HotelFragment());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        llBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft.replace(R.id.main, new BusFragment());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        llAtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft.replace(R.id.main, new ATMFragment());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        llBv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ft.replace(R.id.main, new HospitalFragment());
                ft.addToBackStack(null);
                ft.commit();
            }
        });


        return view;
    }

    private void ActionBarTitleGravity() {
        actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        actionBar.setCustomView(R.layout.custom_action_bar);

        View view = actionBar.getCustomView();
        TextView tvTitle = view.findViewById(R.id.action_bar_title);
        ImageView ivBack = view.findViewById(R.id.action_bar_back);

        tvTitle.setText("Tour Guide");
        ivBack.setVisibility(View.INVISIBLE);

    }

}
