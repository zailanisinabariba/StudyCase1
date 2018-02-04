package com.tugas.zailanisinabariba.ZAILANI_1202154183;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String rm ="Restoran";
    public final static String nama ="NAMA MAKANAN";
    public final static String porsi ="PORSI MAKAN";
    public final static String harga ="HARTOT";
    public final static String msg ="PESAN";

    private EditText mNamaMenu, mPorsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button eatbus = (Button) findViewById(R.id.button);
        Button abnormal=(Button) findViewById(R.id.button2);


        mNamaMenu = (EditText)findViewById(R.id.menu);
        mPorsi = (EditText)findViewById(R.id.porsi);

        eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mNamaMenu.getText().toString().equals("")||mPorsi.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "isi aja dulu", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    String makanan=mNamaMenu.getText().toString();
                    String jumlah = mPorsi.getText().toString();
                    intent.putExtra(rm,"EatBus");
                    intent.putExtra(nama,makanan);
                    intent.putExtra(porsi,jumlah);
                    intent.putExtra(harga,"50000");
                    intent.putExtra(msg,"jangan disimi bos,mahal");
                    startActivity(intent);
                }
            }
        });
        abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mNamaMenu.getText().toString().equals("")||mPorsi.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Di Isi Dulu Say", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    String makanan=mNamaMenu.getText().toString();
                    String jumlah = mPorsi.getText().toString();
                    intent.putExtra(rm,"Abnormal");
                    intent.putExtra(nama,makanan);
                    intent.putExtra(porsi,jumlah);
                    intent.putExtra(harga,"30000");
                    intent.putExtra(msg,"lanjut aja bos Q");
                    startActivity(intent);
                }
            }
        });

    }

}