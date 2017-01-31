package com.example.shilp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelpScreen extends AppCompatActivity {
    Button back;

    /* renamed from: com.example.shilp.myapplication.HelpScreen.1 */
    class C02041 implements OnClickListener {
        C02041() {
        }

        public void onClick(View v) {
            HelpScreen.this.startActivity(new Intent(HelpScreen.this, MainActivity.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_help_screen);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.back = (Button) findViewById(C0219R.id.returnHome);
        this.back.setOnClickListener(new C02041());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
