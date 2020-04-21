package com.example.step3_projectdve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.step3_projectdve.Dialog.DialogPopup;

public class ActivityB extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        button = findViewById(R.id.buttonActivityBPopDialog);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        DialogPopup dialogPopup = new DialogPopup();
        dialogPopup.show(getSupportFragmentManager(),"Dialog Popup");
    }
}
