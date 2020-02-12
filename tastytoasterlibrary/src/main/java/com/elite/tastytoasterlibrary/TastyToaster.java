package com.elite.tastytoasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class TastyToaster {

    public static void TastyMessage(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
