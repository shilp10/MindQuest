package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Wrong_Answer extends AppCompatActivity {
    Button return1;

    /* renamed from: com.example.shilp.myapplication.Wrong_Answer.1 */
    class C02201 implements OnClickListener {
        C02201() {
        }

        public void onClick(View v) {
            Wrong_Answer.this.startActivity(new Intent(Wrong_Answer.this, Lock1.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_wrong__answer);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.return1 = (Button) findViewById(C0219R.id.return_button);
        this.return1.setOnClickListener(new C02201());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
