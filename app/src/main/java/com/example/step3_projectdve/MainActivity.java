package com.example.step3_projectdve;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.step3_projectdve.Dialog.DialogPopup;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button openDialog;
    private Button openB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openDialog = findViewById(R.id.buttonMainPopDialog);
        openB = findViewById(R.id.buttonToB);
        openB.setOnClickListener(this);
        openDialog.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.buttonMainPopDialog:
                DialogPopup dialogPopup = new DialogPopup();
                dialogPopup.show(getSupportFragmentManager(),"Dialog Popup");
                break;

            case R.id.buttonToB:
                Intent intent = new Intent(MainActivity.this,ActivityB.class);
                startActivity(intent);
                break;
        }

    }
}
