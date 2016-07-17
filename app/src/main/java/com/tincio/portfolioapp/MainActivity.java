package com.tincio.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnPopular;
    Button btnStock;
    Button btnBuild;
    Button btnMakeapp;
    Button btnGo;
    Button btnCapstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPopular = (Button)findViewById(R.id.btn_popular);
        btnStock= (Button)findViewById(R.id.btn_stock);
        btnBuild= (Button)findViewById(R.id.btn_build);
        btnMakeapp = (Button)findViewById(R.id.btn_makeapp);
        btnGo = (Button)findViewById(R.id.btn_go);
        btnCapstone= (Button)findViewById(R.id.btn_capstone);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnPopular.setOnClickListener(this);
        btnStock.setOnClickListener(this);
        btnBuild.setOnClickListener(this);
        btnMakeapp.setOnClickListener(this);
        btnGo.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_popular:
                Toast.makeText(this,"This button will launch my popular movies app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_stock:
                Toast.makeText(this,"This button will launch my stock hawk app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_build:
                Toast.makeText(this,"This button will launch my build it bigger app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_makeapp:
                Toast.makeText(this,"This button will launch my make your app material app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_go:
                Toast.makeText(this,"This button will launch my go ubiquitous app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_capstone:
                Toast.makeText(this,"This button will launch my capstone app", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
