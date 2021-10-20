package com.petrik.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView tevalasztas,gepvalasztas;
    private Button kobutton,papirbutton,ollobutton;
    private ImageView[] kezjel;
    private TextView eredmeny;


    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        kobutton=findViewById(R.id.ko_button);

        papirbutton=findViewById(R.id.papir_button);
        ollobutton=findViewById(R.id.ollo_button);
        tevalasztas=findViewById(R.id.te_valasztas);
        gepvalasztas=findViewById(R.id.gep_valasztas);
        random=new Random();

    }
    private void koGomb(){
        tevalasztas.setImageResource(R.drawable.rock);
    }
    private  void papirGomb(){
        tevalasztas.setImageResource(R.drawable.paper);
    }
    private void ollogomb(){
        tevalasztas.setImageResource(R.drawable.scissors);
    }
}
