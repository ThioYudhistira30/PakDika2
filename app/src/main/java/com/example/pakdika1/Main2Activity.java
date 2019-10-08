package com.example.pakdika1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    Button login;
    String nim;
    String nama;
    EditText edtNim, edtNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         edtNim = (EditText) findViewById(R.id.edtNim);
         edtNama = (EditText) findViewById(R.id.edtNama);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nim = edtNim.getText().toString();
                String nama = edtNama.getText().toString();
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("Nim",nim);
                i.putExtra("Nama",nama);
                startActivity(i);
            }
        });
    }
}
