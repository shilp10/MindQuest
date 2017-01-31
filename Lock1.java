package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Lock1 extends AppCompatActivity {
    Button correct1;
    Button wrong1;
    Button wrong2;

    /* renamed from: com.example.shilp.myapplication.Lock1.1 */
    class C02071 implements OnClickListener {
        C02071() {
        }

        public void onClick(View v) {
            Lock1.this.startActivity(new Intent(Lock1.this, Wrong_Answer.class));
        }
    }

    /* renamed from: com.example.shilp.myapplication.Lock1.2 */
    class C02082 implements OnClickListener {
        C02082() {
        }

        public void onClick(View v) {
            Lock1.this.startActivity(new Intent(Lock1.this, Wrong_Answer.class));
        }
    }

    /* renamed from: com.example.shilp.myapplication.Lock1.3 */
    class C02093 implements OnClickListener {
        C02093() {
        }

        public void onClick(View v) {
            Lock1.this.startActivity(new Intent(Lock1.this, Correct_Answer.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_lock1);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.wrong1 = (Button) findViewById(C0219R.id.L1wrong1);
        this.wrong2 = (Button) findViewById(C0219R.id.L1wrong2);
        this.correct1 = (Button) findViewById(C0219R.id.L1correct);
        this.wrong1.setOnClickListener(new C02071());
        this.wrong2.setOnClickListener(new C02082());
        this.correct1.setOnClickListener(new C02093());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
