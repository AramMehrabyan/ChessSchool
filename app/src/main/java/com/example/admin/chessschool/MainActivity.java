package com.example.admin.chessschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView2Play;
    private TextView textViewUs;
    private TextView textViewKan;
    private Intent intent;
    private View view1,view2,view3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        textView2Play=findViewById(R.id.textView2Play);
        textView2Play.setOnClickListener(this);
        textViewUs=findViewById(R.id.textViewUs);
        textViewUs.setOnClickListener(this);
        textViewKan=findViewById(R.id.textViewKan);
        textViewKan.setOnClickListener(this);
        view1=findViewById(R.id.view1);
        view2=findViewById(R.id.view2);
        view3=findViewById(R.id.view3);
        view1.setVisibility(View.INVISIBLE);
        view2.setVisibility(View.INVISIBLE);
        view3.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.textView2Play:
                intent=new Intent(MainActivity.this, Game.class);
                view1.setVisibility(View.VISIBLE);
                startActivity(intent);
                break;
            case R.id.textViewUs:
                view2.setVisibility(View.VISIBLE);
                intent=new Intent(MainActivity.this,Chess_Us.class);
                startActivity(intent);
                break;
            case R.id.textViewKan:
                view3.setVisibility(View.VISIBLE);
                intent=new Intent(MainActivity.this,Chess_Kan.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        view1.setVisibility(View.INVISIBLE);
        view2.setVisibility(View.INVISIBLE);
        view3.setVisibility(View.INVISIBLE);
    }
}
