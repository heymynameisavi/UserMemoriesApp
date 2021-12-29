package com.avi.mymeroiesdb.db;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cursoradapter.widget.CursorAdapter;

import com.avi.mymeroiesdb.R;
import com.avi.mymeroiesdb.model.Memory;

public class MemoriesAdapter extends CursorAdapter {

    public MemoriesAdapter(Context context, Cursor cursor, boolean autoRequery) {
        super(context, cursor, autoRequery);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View view = LayoutInflater.from(context).inflate(R.layout.memory_list_item, viewGroup, false);
        view.setTag(new ViewHolder(view));
        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ViewHolder holder = (ViewHolder)view.getTag();

        Memory memory = new Memory(cursor);

        holder.nameTextView.setText(memory.getName());
        holder.addressTextView.setText(memory.getAddress());
        holder.imageView.setImageBitmap(memory.getImage());
    }

    private class ViewHolder {
        final ImageView imageView;
        final TextView nameTextView, addressTextView;

        ViewHolder(View view) {
            imageView = view.findViewById(R.id.list_item_image_view);
            nameTextView = view.findViewById(R.id.list_item_text_name_view);
            addressTextView = view.findViewById(R.id.list_item_text_address_view);
        }
    }
}
