package com.creation.android.lafetegita;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

public class Details3D_Hack extends BaseActivity {

    Button reg_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.details_3d_hack, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.getMenu().getItem(1).setChecked(true);

        /*reg_btn = findViewById(R.id.reg_btn_id);
        Intent intent=new Intent(Details3D_Hack.this,UserProfileActivity.class);
        startActivity(intent);*/

    }
}
