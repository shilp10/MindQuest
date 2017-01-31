package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LE_gate2 extends AppCompatActivity {
    Button lock2;

    /* renamed from: com.example.shilp.myapplication.LE_gate2.1 */
    class C02051 implements OnClickListener {
        C02051() {
        }

        public void onClick(View v) {
            LE_gate2.this.startActivity(new Intent(LE_gate2.this, Lock_2.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_le_gate2);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.lock2 = (Button) findViewById(C0219R.id.LE_level_2);
        this.lock2.setOnClickListener(new C02051());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
