package com.pockete_mita;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.pockete_mita.pockete_mitra.R;

public class Farmerseva extends AppCompatActivity implements View.OnClickListener{
    public ImageButton NextThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmerseva);
        NextThree = (ImageButton)findViewById(R.id.nextThree);
        assert NextThree != null;
        NextThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if( v == NextThree){
            startActivity(new Intent(getApplicationContext(),Camplaint.class));
        }
    }
}
