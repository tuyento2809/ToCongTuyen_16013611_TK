package com.example.student.tocongtuyen_16013611.bai2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.student.tocongtuyen_16013611.R;
import com.example.student.tocongtuyen_16013611.bai1.Bai1Activity;

public class MainActivity extends AppCompatActivity {

    EditText edtKQ;
    Button btnChuyen, btnBai1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtKQ = findViewById(R.id.edtKQ);
        btnChuyen = findViewById(R.id.btnChuyen);
        btnBai1 = findViewById(R.id.btnBai1);

        Intent intent = getIntent();
        String kq = intent.getStringExtra("kq");
        edtKQ.setText(kq);

        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bai1Activity.class);
                startActivity(intent);
            }
        });

    }
}
