package com.benedek.customtitle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // custom title
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

        // full screen activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        // custom title bar
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.custom_title_bar);

    }

    public void onClickTitleBar(View v){
        if (v.getId() == R.id.button_title_bar) {

            Toast.makeText(MainActivity.this, "Button clicked" , Toast.LENGTH_SHORT).show();

        }
    }

}
