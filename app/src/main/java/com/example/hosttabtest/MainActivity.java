package com.example.hosttabtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TabHost tabHost;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost=(TabHost)findViewById(R.id.tabhost);
        b=(Button)findViewById(R.id.button1);

        tabHost.setup();
        TabSpec spec1=tabHost.newTabSpec("TAB 1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("TAB 1");

        TabSpec spec2=tabHost.newTabSpec("TAB 2");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("TAB 2");

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Tab 1 button click",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
