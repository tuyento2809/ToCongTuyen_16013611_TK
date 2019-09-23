package com.example.student.tocongtuyen_16013611.bai2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.student.tocongtuyen_16013611.R;

public class Main2Activity extends AppCompatActivity {

    EditText edtA, edtB, edtC;
    Button btnKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtC = findViewById(R.id.edtC);
        btnKQ = findViewById(R.id.btnKQ);



        btnKQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float a = Float.parseFloat(edtA.getText().toString());
                    float b = Float.parseFloat(edtB.getText().toString());
                    float c = Float.parseFloat(edtC.getText().toString());
                    Intent intent = new Intent(Main2Activity.this, MainActivity.class);

                    intent.putExtra("kq",giaipt(a,b,c));
                    startActivity(intent);
                }
                catch (Exception e){
                    Toast.makeText(Main2Activity.this, "Input khong hop le", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    public String giaipt(float a,float b, float c  ) {
        if (a == 0) {
            if (b == 0) {
                return "Phương trình vô nghiệm!";
            } else {
                return "Phương trình có một nghiệm: "
                        + "x = " + (-c / b);
            }
            //return;
        }
        // tính delta
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            return "Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            return "Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1;
        } else {
            return "Phương trình vô nghiệm!";
        }

    }
}

