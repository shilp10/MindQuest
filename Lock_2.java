package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Lock_2 extends AppCompatActivity {
    Button ANS1;
    Button ANS2;
    Button ANS3;
    Button ANS4;

    /* renamed from: com.example.shilp.myapplication.Lock_2.1 */
    class C02101 implements OnClickListener {
        C02101() {
        }

        public void onClick(View v) {
            Lock_2.this.startActivity(new Intent(Lock_2.this, Correct_Answer2.class));
        }
    }

    /* renamed from: com.example.shilp.myapplication.Lock_2.2 */
    class C02112 implements OnClickListener {
        C02112() {
        }

        public void onClick(View v) {
            Lock_2.this.startActivity(new Intent(Lock_2.this, Wrong_Answer2.class));
        }
    }

    /* renamed from: com.example.shilp.myapplication.Lock_2.3 */
    class C02123 implements OnClickListener {
        C02123() {
        }

        public void onClick(View v) {
            Lock_2.this.startActivity(new Intent(Lock_2.this, Wrong_Answer2.class));
        }
    }

    /* renamed from: com.example.shilp.myapplication.Lock_2.4 */
    class C02134 implements OnClickListener {
        C02134() {
        }

        public void onClick(View v) {
            Lock_2.this.startActivity(new Intent(Lock_2.this, Wrong_Answer2.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_lock_2);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.ANS1 = (Button) findViewById(C0219R.id.Q2_ANS_1);
        this.ANS2 = (Button) findViewById(C0219R.id.Q2_ANS2);
        this.ANS3 = (Button) findViewById(C0219R.id.Q2_ANS3);
        this.ANS4 = (Button) findViewById(C0219R.id.Q2_ANS4);
        this.ANS1.setOnClickListener(new C02101());
        this.ANS2.setOnClickListener(new C02112());
        this.ANS3.setOnClickListener(new C02123());
        this.ANS4.setOnClickListener(new C02134());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
