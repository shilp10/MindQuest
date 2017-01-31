package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class le_gate3 extends AppCompatActivity {
    Button Lock3;

    /* renamed from: com.example.shilp.myapplication.le_gate3.1 */
    class C02271 implements OnClickListener {
        C02271() {
        }

        public void onClick(View v) {
            le_gate3.this.startActivity(new Intent(le_gate3.this, lock_3.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_le_gate3);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.Lock3 = (Button) findViewById(C0219R.id.LE_level_3);
        this.Lock3.setOnClickListener(new C02271());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
