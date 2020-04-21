package com.example.step3_projectdve.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.step3_projectdve.R;
import com.google.android.material.snackbar.Snackbar;

public class DialogPopup extends AppCompatDialogFragment implements View.OnClickListener {


    private AlertDialog.Builder builder;
    private EditText name;
    private EditText mobile;
    private Button button;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        builder = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.popup,null);
        name = view.findViewById(R.id.name_editText);
        mobile = view.findViewById(R.id.mobile_editText);
        button = view.findViewById(R.id.buttonSample_button);
        button.setOnClickListener(this);
        builder.setView(view);
        return builder.create();
    }

    @Override
    public void onClick(View view) {
        Snackbar.make(view,"Snackbar In Dialog",Snackbar.LENGTH_SHORT)
                .setAction("Action",null).show();
    }
}
