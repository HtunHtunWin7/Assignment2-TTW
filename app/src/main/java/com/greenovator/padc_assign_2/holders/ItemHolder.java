package com.greenovator.padc_assign_2.holders;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.greenovator.padc_assign_2.delegates.ItemDelegate;

public class ItemHolder extends RecyclerView.ViewHolder {
    private ItemDelegate itemDelegate;
    public ItemHolder(@NonNull View itemView,ItemDelegate delegate) {
        super(itemView);
        itemDelegate = delegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemDelegate.onTapItem();
            }
        });
    }
}
