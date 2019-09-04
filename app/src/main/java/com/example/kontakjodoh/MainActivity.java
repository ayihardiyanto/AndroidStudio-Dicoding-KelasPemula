package com.example.kontakjodoh;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.kontakjodoh.adapter.KontakAdapter;
import com.example.kontakjodoh.model.Kontak;
import com.example.kontakjodoh.model.KontakData;

import java.io.ByteArrayOutputStream;
import java.lang.annotation.AnnotationFormatError;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{

    private RecyclerView rvHome;
    private ArrayList<Kontak> list = new ArrayList<>();
    private ActionBar actionBar;
    private ImageView imageView;
    private TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("##09c6df")));
//
//        if (getActionBar() != null) {
//            String title = "About Me";
//            getActionBar().setTitle(title);
//        }
        tvStatus = findViewById(R.id.status);
        rvHome = findViewById(R.id.rv_home);
        rvHome.setHasFixedSize(true);

        list.addAll(KontakData.getListData());
        showRecyclerList();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profile:
                Intent profil = new Intent(MainActivity.this, about_Me.class);
                startActivity(profil);
                return true;
            case R.id.aboutApp:
                Intent about = new Intent(MainActivity.this, aboutApp.class);
                startActivity(about);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList() {
        rvHome.setLayoutManager(new LinearLayoutManager(this));
        rvHome.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        KontakAdapter k = new KontakAdapter(list);
        rvHome.setAdapter(k);
        k.setOnItemClickCallBack(new KontakAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Kontak data) {
                Intent detil = new Intent(MainActivity.this, DetailLook.class);
                detil.putExtra(DetailLook.EXTRA_NAME, data.getNama());
                detil.putExtra(DetailLook.EXTRA_STATUS, data.getStatus());
                detil.putExtra(DetailLook.EXTRA_ABOUT, data.getAbout());
                detil.putExtra(DetailLook.EXTRA_PHOTO, data.getPhoto());
                detil.putExtra("R1", data.getR1());
                detil.putExtra("R2", data.getR2());
                detil.putExtra("R3", data.getR3());
                detil.putExtra("R4", data.getR4());
                startActivity(detil);


            }
        });
    }



}
