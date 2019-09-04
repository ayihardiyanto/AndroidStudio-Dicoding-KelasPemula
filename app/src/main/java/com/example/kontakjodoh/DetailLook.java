package com.example.kontakjodoh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.kontakjodoh.model.Kontak;

import java.util.ArrayList;

public class DetailLook extends AppCompatActivity implements View.OnClickListener {
    ArrayList<Kontak> data = new ArrayList<>();
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_STATUS = "EXTRA_STATUS";
    public static final String EXTRA_PHOTO = "EXTRA_PHOTO";
    public static final String EXTRA_ABOUT = "EXTRA_ABOUT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_look);
        backButton();

        ImageView imgPhoto = findViewById(R.id.imgPhoto);

        TextView tvName = findViewById(R.id.tv_name);
        TextView tvStatus = findViewById(R.id.status);
        TextView tvAbout = findViewById(R.id.tv_about);
        TextView img = findViewById(R.id.photoText);
        TextView R1 = findViewById(R.id.r1);
        TextView R2 = findViewById(R.id.r2);
        TextView R3 = findViewById(R.id.r3);
        TextView R4 = findViewById(R.id.r4);
        TextView R5 = findViewById(R.id.r5);
        Button btnCall = findViewById(R.id.callP);
        btnCall.setOnClickListener(this);

        tvName.setText(getIntent().getStringExtra(EXTRA_NAME));
        tvStatus.setText(getIntent().getStringExtra(EXTRA_STATUS));
        tvAbout.setText(getIntent().getStringExtra(EXTRA_ABOUT));
        img.setText(getIntent().getStringExtra(EXTRA_PHOTO));
        R2.setText(getIntent().getStringExtra("R2"));
        R3.setText(getIntent().getStringExtra("R3"));
        R4.setText(getIntent().getStringExtra("R4"));
        R1.setText(getIntent().getStringExtra("R1"));
        String i = img.getText().toString();
        String stat = tvStatus.getText().toString();
        if (stat.equals("Nadzor")) {
            tvStatus.setTextColor(Color.parseColor("#FF8c00"));
        } else if (stat.equals("Khitbah")) {
            tvStatus.setTextColor(Color.parseColor("#FF0000"));
        } else {
            tvStatus.setTextColor(Color.parseColor("#00FF7f"));
        }


        Glide.with(this).load(i).apply(new RequestOptions().override(200, 200))
                .into(imgPhoto);


    }

    public void backButton() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.callP) {
            Uri number = Uri.parse(("tel:081218829455"));
            Intent i = new Intent(Intent.ACTION_DIAL, number);
            startActivity(i);
        }
    }
}

