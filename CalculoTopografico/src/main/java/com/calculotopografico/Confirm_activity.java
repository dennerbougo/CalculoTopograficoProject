package com.calculotopografico;

/**
 * Created by romulomessias on 17/09/13.
 */

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class Confirm_activity extends Activity implements OnClickListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_confirm);

        TabHost tabHost=(TabHost)findViewById(R.id.tabHost);

        tabHost.setup();

        TabSpec tab1 = tabHost.newTabSpec("Tab 1");
        tab1.setContent(R.id.tabImage);
        tab1.setIndicator("Poligono");

        TabSpec tab2 =tabHost.newTabSpec("Tab 2");
        tab2.setIndicator("Pontos");
        tab2.setContent(R.id.tabList);

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);

        View toCalc = findViewById(R.id.toCalc);
        toCalc.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_confirm, menu);
        return true;
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.toCalc){
            Intent intent = new Intent(this, Classific_activity.class);
            this.startActivity(intent);
            this.overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_right);
        }

    }
}
