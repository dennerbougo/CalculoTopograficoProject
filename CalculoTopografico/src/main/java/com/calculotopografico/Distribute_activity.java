package com.calculotopografico;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Created by romulomessias on 17/09/13.
 */
public class Distribute_activity extends Activity  implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distribute);

        View toSave = findViewById(R.id.toSave);
        toSave.setOnClickListener(this);
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
        if(v.getId() == R.id.toSave){
//            Intent intent = new Intent(this, main.class);
//            this.startActivity(intent);
//            this.overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_right);
        }
    }
}
