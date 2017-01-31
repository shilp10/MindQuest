package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MapScreen extends AppCompatActivity {
    Button logic_e;

    /* renamed from: com.example.shilp.myapplication.MapScreen.1 */
    class C02181 implements OnClickListener {
        C02181() {
        }

        public void onClick(View v) {
            MapScreen.this.startActivity(new Intent(MapScreen.this, Logics_Edge_Level_Page.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_map_screen);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.logic_e = (Button) findViewById(C0219R.id.Level_1);
        this.logic_e.setOnClickListener(new C02181());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
