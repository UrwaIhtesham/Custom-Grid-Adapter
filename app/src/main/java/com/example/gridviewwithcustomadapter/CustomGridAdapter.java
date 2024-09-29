package com.example.gridviewwithcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGridAdapter extends BaseAdapter {
    private Context mContext;
    private final String[] gridText;
    private final int[] gridImages;

    public CustomGridAdapter(Context context, String[] text, int[] images) {
        mContext = context;
        gridText = text;
        gridImages = images;
    }

    @Override
    public int getCount() {
        return gridText.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid_item, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView) grid.findViewById(R.id.grid_image);
            textView.setText(gridText[position]);
            imageView.setImageResource(gridImages[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}
