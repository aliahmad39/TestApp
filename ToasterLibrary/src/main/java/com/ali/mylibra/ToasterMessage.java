package com.ali.mylibra;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToasterMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }

    public static void start(Context c){

       c.startActivity(new Intent(c , CalcuActivity.class));

    }
}
