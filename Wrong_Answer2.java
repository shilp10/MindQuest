package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Wrong_Answer2 extends AppCompatActivity {
    Button return2;

    /* renamed from: com.example.shilp.myapplication.Wrong_Answer2.1 */
    class C02211 implements OnClickListener {
        C02211() {
        }

        public void onClick(View v) {
            Wrong_Answer2.this.startActivity(new Intent(Wrong_Answer2.this, Lock_2.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_wrong__answer2);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.return2 = (Button) findViewById(C0219R.id.return2);
        this.return2.setOnClickListener(new C02211());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
