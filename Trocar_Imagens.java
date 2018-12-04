package com.example.gustavoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgDBZ;
    private int[] imagens= {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDBZ=findViewById(R.id.imgDBZId);
    }

    public void trocarImagem(View view){

        Random random= new Random();

        imgDBZ.setImageResource(imagens[random.nextInt(5)]);
    }
}