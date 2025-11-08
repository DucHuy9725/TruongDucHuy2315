package com.example.test_recyclerview;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tvName);
    }
}
