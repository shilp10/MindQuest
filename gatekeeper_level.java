package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class gatekeeper_level extends AppCompatActivity {
    Button correctBoss;
    Button fail1;
    Button fail2;

    /* renamed from: com.example.shilp.myapplication.gatekeeper_level.1 */
    class C02241 implements OnClickListener {
        C02241() {
        }

        public void onClick(View v) {
            gatekeeper_level.this.startActivity(new Intent(gatekeeper_level.this, Level1_Complete.class));
        }
    }

    /* renamed from: com.example.shilp.myapplication.gatekeeper_level.2 */
    class C02252 implements OnClickListener {
        C02252() {
        }

        public void onClick(View v) {
            gatekeeper_level.this.startActivity(new Intent(gatekeeper_level.this, BOSS_FAIL.class));
        }
    }

    /* renamed from: com.example.shilp.myapplication.gatekeeper_level.3 */
    class C02263 implements OnClickListener {
        C02263() {
        }

        public void onClick(View v) {
            gatekeeper_level.this.startActivity(new Intent(gatekeeper_level.this, BOSS_FAIL.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_gatekeeper_level);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.correctBoss = (Button) findViewById(C0219R.id.lance);
        this.correctBoss.setOnClickListener(new C02241());
        this.fail1 = (Button) findViewById(C0219R.id.none);
        this.fail1.setOnClickListener(new C02252());
        this.fail2 = (Button) findViewById(C0219R.id.arthur);
        this.fail2.setOnClickListener(new C02263());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
