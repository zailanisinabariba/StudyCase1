package com.tugas.zailanisinabariba.ZAILANI_1202154183;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    private int duit =65500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String warung = intent.getStringExtra(MainActivity.rm);
        String makanan = intent.getStringExtra(MainActivity.nama);
        String jumlah2 = intent.getStringExtra(MainActivity.porsi);
        String harga = intent.getStringExtra(MainActivity.harga);
        String pesan = intent.getStringExtra(MainActivity.msg);

        TextView warungTextview = (TextView) findViewById(R.id.tempatmakan);
        TextView makananTextview = (TextView) findViewById(R.id.menu);
        TextView jumlahTextview = (TextView) findViewById(R.id.textView8_porsi);
        TextView hargaTextview = (TextView) findViewById(R.id.total);
        int jumlahbenar = Integer.parseInt(harga)*Integer.parseInt(jumlah2);
        warungTextview.setText(warung);
        makananTextview.setText(makanan);
        jumlahTextview.setText(jumlah2);
        if(duit > jumlahbenar){
            Toast.makeText(getApplicationContext(), pesan, Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), pesan, Toast.LENGTH_LONG).show();
        }
        hargaTextview.setText(Integer.toString(jumlahbenar));

    }
}