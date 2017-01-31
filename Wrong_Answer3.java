package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Wrong_Answer3 extends AppCompatActivity {
    Button return3;

    /* renamed from: com.example.shilp.myapplication.Wrong_Answer3.1 */
    class C02221 implements OnClickListener {
        C02221() {
        }

        public void onClick(View v) {
            Wrong_Answer3.this.startActivity(new Intent(Wrong_Answer3.this, lock_3.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_wrong__answer3);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.return3 = (Button) findViewById(C0219R.id.return3);
        this.return3.setOnClickListener(new C02221());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
