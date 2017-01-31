package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Logics_Edge_Level_Page extends AppCompatActivity {
    Button puzzle1;

    /* renamed from: com.example.shilp.myapplication.Logics_Edge_Level_Page.1 */
    class C02141 implements OnClickListener {
        C02141() {
        }

        public void onClick(View v) {
            Logics_Edge_Level_Page.this.startActivity(new Intent(Logics_Edge_Level_Page.this, Lock1.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_logics__edge__level__page);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.puzzle1 = (Button) findViewById(C0219R.id.LE_level_1);
        this.puzzle1.setOnClickListener(new C02141());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
