package com.example.lab3milestone2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.abhiandroid.fragmentexample.R;


public class MainActivity extends AppCompatActivity {
    Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get the reference of Button's
        firstFragment = (Button) findViewById(R.id.firstFragment);
        secondFragment = (Button) findViewById(R.id.secondFragment);

        firstFragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                loadFragment(new FirstFragment());
            }
        });

        secondFragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                loadFragment(new SecondFragment());
            }
        });

    }
    private void loadFragment(Fragment fragment){
        System.out.println("Button Pressed");
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}
