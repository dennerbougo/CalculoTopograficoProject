package com.calculotopografico;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class main extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost=(TabHost)findViewById(R.id.tabInicio);

        tabHost.setup();

        TabSpec tab1 = tabHost.newTabSpec("Tab 1");
        tab1.setContent(R.id.tabNovo);
        tab1.setIndicator("Novo Levantamento");

        TabSpec tab2 =tabHost.newTabSpec("Tab 2");
        tab2.setIndicator("Historico");
        tab2.setContent(R.id.tabHistorico);

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);

        View toPoligono = findViewById(R.id.toPoligono);
        toPoligono.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.toPoligono){
            Intent intent = new Intent(this, Poligono_activity.class);
            this.startActivity(intent);
            this.overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_right);
        }
        else if (v.getId() == R.id.Ok_PC){

        }
    }
    
}
