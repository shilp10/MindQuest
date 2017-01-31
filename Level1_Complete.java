package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Level1_Complete extends AppCompatActivity {
    Button Demo;

    /* renamed from: com.example.shilp.myapplication.Level1_Complete.1 */
    class C02061 implements OnClickListener {
        C02061() {
        }

        public void onClick(View v) {
            Level1_Complete.this.startActivity(new Intent(Level1_Complete.this, MainActivity.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_level1__complete);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.Demo = (Button) findViewById(C0219R.id.again);
        this.Demo.setOnClickListener(new C02061());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
