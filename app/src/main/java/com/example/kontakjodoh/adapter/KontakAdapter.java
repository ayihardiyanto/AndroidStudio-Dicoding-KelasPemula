package com.example.kontakjodoh.adapter;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.kontakjodoh.MainActivity;
import com.example.kontakjodoh.R;
import com.example.kontakjodoh.model.Kontak;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.ListViewHolder> {
    private ArrayList<Kontak> listKontak;
    private OnItemClickCallBack onItemClickCallBack;

    public void setOnItemClickCallBack(OnItemClickCallBack onItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack;
    }

    public KontakAdapter(ArrayList<Kontak> list) {
        this.listKontak = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home_screen, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Kontak kontak = listKontak.get(position);

        Glide.with(holder.itemView.getContext())
                .load(kontak.getPhoto())
                .apply(new RequestOptions().override(150,150))
                .into(holder.imgPhoto);

        holder.tvName.setText(kontak.getNama());
        holder.tvStatus.setText(kontak.getStatus());
        String stat = holder.tvStatus.getText().toString();
        if (stat.equals("Nadzor")) {
            holder.tvStatus.setTextColor(Color.parseColor("#FF8c00"));
        } else if (stat.equals("Khitbah")) {
            holder.tvStatus.setTextColor(Color.parseColor("#FF0000"));
        } else {
            holder.tvStatus.setTextColor(Color.parseColor("#00FF7f"));
        }

        holder.tvAbout.setText(kontak.getAbout());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallBack.onItemClicked(listKontak.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKontak.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvAbout, tvStatus;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.item_photo);
            tvName = itemView.findViewById(R.id.tv_name);
            tvStatus = itemView.findViewById(R.id.status);
            tvAbout = itemView.findViewById(R.id.tv_about);

        }
    }

    public interface OnItemClickCallBack {
    void onItemClicked(Kontak data);
    }
}
