package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class lock_3 extends AppCompatActivity {
    Button ANS1;
    Button ANS2;
    Button ANS3;
    Button ANS4;

    /* renamed from: com.example.shilp.myapplication.lock_3.1 */
    class C02291 implements OnClickListener {
        C02291() {
        }

        public void onClick(View v) {
            lock_3.this.startActivity(new Intent(lock_3.this, Wrong_Answer3.class));
        }
    }

    /* renamed from: com.example.shilp.myapplication.lock_3.2 */
    class C02302 implements OnClickListener {
        C02302() {
        }

        public void onClick(View v) {
            lock_3.this.startActivity(new Intent(lock_3.this, Wrong_Answer3.class));
        }
    }

    /* renamed from: com.example.shilp.myapplication.lock_3.3 */
    class C02313 implements OnClickListener {
        C02313() {
        }

        public void onClick(View v) {
            lock_3.this.startActivity(new Intent(lock_3.this, correct_answer3.class));
        }
    }

    /* renamed from: com.example.shilp.myapplication.lock_3.4 */
    class C02324 implements OnClickListener {
        C02324() {
        }

        public void onClick(View v) {
            lock_3.this.startActivity(new Intent(lock_3.this, Wrong_Answer3.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_lock_3);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.ANS1 = (Button) findViewById(C0219R.id.radioButton4);
        this.ANS1.setOnClickListener(new C02291());
        this.ANS2 = (Button) findViewById(C0219R.id.radioButton5);
        this.ANS2.setOnClickListener(new C02302());
        this.ANS3 = (Button) findViewById(C0219R.id.radioButton6);
        this.ANS3.setOnClickListener(new C02313());
        this.ANS4 = (Button) findViewById(C0219R.id.radioButton7);
        this.ANS4.setOnClickListener(new C02324());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
