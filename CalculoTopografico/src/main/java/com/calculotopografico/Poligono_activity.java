package com.calculotopografico;

/**
 * Created by romulomessias on 17/09/13.
 */

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Poligono_activity extends Activity
    implements OnClickListener
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poligono);

        View toConfirm = findViewById(R.id.toConfirm);
        toConfirm.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.toConfirm){
            Intent intent = new Intent(this, Confirm_activity.class);
            this.startActivity(intent);
            this.overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_right);
        }
    }
}
