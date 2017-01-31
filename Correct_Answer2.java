package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Correct_Answer2 extends AppCompatActivity {
    Button Cont2;

    /* renamed from: com.example.shilp.myapplication.Correct_Answer2.1 */
    class C02031 implements OnClickListener {
        C02031() {
        }

        public void onClick(View v) {
            Correct_Answer2.this.startActivity(new Intent(Correct_Answer2.this, le_gate3.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_correct__answer2);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.Cont2 = (Button) findViewById(C0219R.id.Continue_button2);
        this.Cont2.setOnClickListener(new C02031());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
