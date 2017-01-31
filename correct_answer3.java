package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class correct_answer3 extends AppCompatActivity {
    Button Cont3;

    /* renamed from: com.example.shilp.myapplication.correct_answer3.1 */
    class C02231 implements OnClickListener {
        C02231() {
        }

        public void onClick(View v) {
            correct_answer3.this.startActivity(new Intent(correct_answer3.this, le_gate4.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_correct_answer3);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.Cont3 = (Button) findViewById(C0219R.id.Continue_button2);
        this.Cont3.setOnClickListener(new C02231());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
