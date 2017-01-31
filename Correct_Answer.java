package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Correct_Answer extends AppCompatActivity {
    Button Cont;

    /* renamed from: com.example.shilp.myapplication.Correct_Answer.1 */
    class C02021 implements OnClickListener {
        C02021() {
        }

        public void onClick(View v) {
            Correct_Answer.this.startActivity(new Intent(Correct_Answer.this, LE_gate2.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_correct__answer);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.Cont = (Button) findViewById(C0219R.id.continue_button);
        this.Cont.setOnClickListener(new C02021());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
