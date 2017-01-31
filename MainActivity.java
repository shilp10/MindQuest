package com.example.shilp.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button help;
    Button play;
    MediaPlayer player;

    /* renamed from: com.example.shilp.myapplication.MainActivity.1 */
    class C02151 implements OnClickListener {
        C02151() {
        }

        public void onClick(View v) {
            MainActivity.this.startActivity(new Intent(MainActivity.this, MapScreen.class));
        }
    }

    /* renamed from: com.example.shilp.myapplication.MainActivity.2 */
    class C02162 implements OnClickListener {
        C02162() {
        }

        public void onClick(View v) {
            MainActivity.this.player = MediaPlayer.create(MainActivity.this, C0219R.raw.adventuremusic);
            MainActivity.this.startActivity(new Intent(MainActivity.this, MapScreen.class));
            MainActivity.this.player.start();
        }
    }

    /* renamed from: com.example.shilp.myapplication.MainActivity.3 */
    class C02173 implements OnClickListener {
        C02173() {
        }

        public void onClick(View v) {
            MainActivity.this.startActivity(new Intent(MainActivity.this, HelpScreen.class));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0219R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(C0219R.id.toolbar));
        this.play = (Button) findViewById(C0219R.id.play_button);
        this.help = (Button) findViewById(C0219R.id.help_button);
        this.play.setOnClickListener(new C02151());
        this.play.setOnClickListener(new C02162());
        this.help.setOnClickListener(new C02173());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0219R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == C0219R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
