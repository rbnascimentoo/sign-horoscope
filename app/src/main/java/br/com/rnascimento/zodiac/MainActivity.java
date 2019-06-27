package br.com.rnascimento.zodiac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewCapricornio;
    private TextView textViewPeixes;
    private TextView textViewAquario;
    private TextView textViewAries;
    private TextView textViewTouro;
    private TextView textViewGemeos;
    private TextView textViewCancer;
    private TextView textViewLeao;
    private TextView textViewVirgem;
    private TextView textViewLibra;
    private TextView textViewEscorpiao;
    private TextView textViewSagitario;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(MainActivity.this, DetailsActivity.class);

        initFields();
        initSetOnClickListeners();

    }

    private void initSetOnClickListeners() {

        textViewCapricornio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sign", "capricorn");
                startActivity(intent);
            }
        });

        textViewPeixes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sign", "pisces");
                startActivity(intent);
            }
        });

        textViewAquario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sign", "aquarius");
                startActivity(intent);
            }
        });

        textViewAries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sign", "aries");
                startActivity(intent);
            }
        });

        textViewTouro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sign", "taurus");
                startActivity(intent);
            }
        });

        textViewGemeos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sign", "gemini");
                startActivity(intent);
            }
        });

        textViewCancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sign", "cancer");
                startActivity(intent);
            }
        });

        textViewLeao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sign", "leo");
                startActivity(intent);
            }
        });

        textViewVirgem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sign", "virgo");
                startActivity(intent);
            }
        });

        textViewLibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sign", "libra");
                startActivity(intent);
            }
        });

        textViewEscorpiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sign", "scorpio");
                startActivity(intent);
            }
        });

        textViewSagitario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("sign", "sagitarius");
                startActivity(intent);
            }
        });
    }

    private void initFields() {
        textViewCapricornio = findViewById(R.id.textViewCapricornio);
        textViewPeixes = findViewById(R.id.textViewPeixes);
        textViewAquario = findViewById(R.id.textViewAquario);
        textViewAries = findViewById(R.id.textViewAries);
        textViewTouro = findViewById(R.id.textViewTouro);
        textViewGemeos = findViewById(R.id.textViewGemeos);
        textViewCancer = findViewById(R.id.textViewCancer);
        textViewLeao = findViewById(R.id.textViewLeao);
        textViewVirgem = findViewById(R.id.textViewVirgem);
        textViewLibra = findViewById(R.id.textViewLibra);
        textViewEscorpiao = findViewById(R.id.textViewEscorpiao);
        textViewSagitario = findViewById(R.id.textViewSargitario);
    }
}
