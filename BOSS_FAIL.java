package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BOSS_FAIL extends AppCompatActivity {
    Button tryAgain;

    /* renamed from: com.example.shilp.myapplication.BOSS_FAIL.1 */
    class C02011 implements OnClickListener {
        C02011() {
        }

        public void onClick(View v) {
            BOSS_FAIL.this.startActivity(new Intent(BOSS_FAIL.this, gatekeeper_level.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_boss__fail);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.tryAgain = (Button) findViewById(C0219R.id.bossfail);
        this.tryAgain.setOnClickListener(new C02011());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
