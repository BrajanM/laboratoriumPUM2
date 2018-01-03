package com.example.student.aplikacjapogodowa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;

import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    private EditText edit;

    private TextView tekst;

    private Button pobierz;

    private Button zmien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        edit = (EditText)findViewById(R.id.Edit);

        pobierz = (Button)findViewById(R.id.Pobierz);


        pobierz.setOnClickListener(onClick);

        tekst = (TextView)findViewById(R.id.Tekst);

        zmien=(Button)findViewById(R.id.Zmien);

        zmien.setOnClickListener(onClick2);
    }
    private View.OnClickListener onClick=new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            tekst.setText(edit.getText().toString());

        }
    };
    private View.OnClickListener onClick2=new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
              MainActivity.this.startActivity(intent);
              Bundle bundle=new Bundle();
              bundle.putString("miasto", String.valueOf(tekst));
              intent.putExtras(bundle);
        }
    };


}
