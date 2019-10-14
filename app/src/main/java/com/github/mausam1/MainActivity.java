package com.github.mausam1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button roorkee_btn;
    Button ddn_btn;
    Button pauri_btn;
    View nav_frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav_frag = findViewById(R.id.nav_host_fragment);

        roorkee_btn = findViewById(R.id.btn_roorkee);
        ddn_btn = findViewById(R.id.btn_ddn);
        pauri_btn = findViewById(R.id.btn_pauri);

        roorkee_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCommonBg();
                roorkee_btn.setBackgroundColor(getResources().getColor(R.color.orange));
                Navigation.findNavController(nav_frag).navigate(R.id.roorkee);
            }
        });

        ddn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCommonBg();
                ddn_btn.setBackgroundColor(getResources().getColor(R.color.orange));
                Navigation.findNavController(nav_frag).navigate(R.id.dehradunFrag);
            }
        });


        pauri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCommonBg();
                pauri_btn.setBackgroundColor(getResources().getColor(R.color.orange));
                Navigation.findNavController(nav_frag).navigate(R.id.pauriFrag);
            }
        });
    }

    private void setCommonBg() {
        roorkee_btn.setBackgroundColor(getResources().getColor(R.color.yello_dark));
        ddn_btn.setBackgroundColor(getResources().getColor(R.color.yello_dark));
        pauri_btn.setBackgroundColor(getResources().getColor(R.color.yello_dark));
    }
}
