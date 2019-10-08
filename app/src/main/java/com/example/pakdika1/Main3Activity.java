package com.example.pakdika1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    String Nim, Nama;
    TextView txtNim, txtNama;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtNim = findViewById(R.id.klrnim);
        txtNama = findViewById(R.id.username);

        Intent i = getIntent();
        Bundle extras = getIntent().getExtras();
        String nim = i.getStringExtra("Nim");
        txtNim.setText(nim);

        String nama = i.getStringExtra("Nama");
        txtNama.setText(nama);

        exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(i);
            }
        });
    }

}
