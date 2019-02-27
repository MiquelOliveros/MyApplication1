package com.example.miquel.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

class Toaster implements View.OnClickListener {
    private Context cc;

    public Toaster(MainActivity mainActivity) {
        cc = mainActivity;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(cc, R.string.toast, Toast.LENGTH_SHORT).show();
    }
}
