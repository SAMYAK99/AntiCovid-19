package com.projects.anticovid_19.MythBusters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.projects.anticovid_19.R;

import java.util.List;

public class MythBusterAdapter extends RecyclerView.Adapter<MythBusterAdapter.ViewHolder> {
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title, content;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            title = itemView.findViewById(R.id.precTitle);
            content = itemView.findViewById(R.id.precContent);
        }
    }

    private Context context;
    private List<MythBusterModel> precList;


    public MythBusterAdapter(Context context, List<MythBusterModel> precList) {
        this.context = context;
        this.precList = precList;
    }

    @NonNull
    @Override
    public MythBusterAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MythBusterAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.myth_buster_cardview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MythBusterAdapter.ViewHolder holder, int position) {
        MythBusterModel precModel = precList.get(position);
        holder.title.setText(precModel.title);
        if (precModel.content.equals(""))
            holder.content.setVisibility(View.GONE);

        holder.content.setText(precModel.content);
    }

    @Override
    public int getItemCount() {
        return precList.size();
    }
}
