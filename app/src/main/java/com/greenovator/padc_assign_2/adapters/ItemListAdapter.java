package com.greenovator.padc_assign_2.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.greenovator.padc_assign_2.R;
import com.greenovator.padc_assign_2.delegates.ItemDelegate;
import com.greenovator.padc_assign_2.holders.ItemHolder;

public class ItemListAdapter extends RecyclerView.Adapter {
    private ItemDelegate itemDelegate;

    public ItemListAdapter(ItemDelegate itemDelegate) {
        this.itemDelegate = itemDelegate;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_lists, parent, false);
        return new ItemHolder(view, itemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
