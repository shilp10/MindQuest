package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class le_gate4 extends AppCompatActivity {
    Button Gatekeep;

    /* renamed from: com.example.shilp.myapplication.le_gate4.1 */
    class C02281 implements OnClickListener {
        C02281() {
        }

        public void onClick(View v) {
            le_gate4.this.startActivity(new Intent(le_gate4.this, gatekeeper_level.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_le_gate4);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.Gatekeep = (Button) findViewById(C0219R.id.LE_Boss_Button);
        this.Gatekeep.setOnClickListener(new C02281());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
