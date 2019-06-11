package com.example.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Item> itemList = new ArrayList<>();

    public CustomAdapter(Context context, int layout, List<Item> itemList) {
        this.context = context;
        this.layout = layout;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        Log.d("duc", "size = " + itemList.size());
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        ImageView imageView;
        TextView tvName, tvDescribe;
        LinearLayout linearLayout;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            holder.tvName = (TextView) view.findViewById(R.id.tvName);
            holder.tvDescribe = (TextView) view.findViewById(R.id.tvDescribe);
            holder.imageView = (ImageView) view.findViewById(R.id.imageView);
            holder.linearLayout=(LinearLayout) view.findViewById(R.id.ll_item);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        Item item = itemList.get(position);
        holder.tvName.setText(item.getName());
        holder.tvDescribe.setText(item.getLocation());
        holder.imageView.setImageResource(item.getImage());
        holder.linearLayout.setBackgroundColor(ContextCompat.getColor(context, item.getColor()));

        return view;
    }
}
