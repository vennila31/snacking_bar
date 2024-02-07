package com.tw.snackbar_library

import android.content.Context
import android.widget.Toast

object SnackingBar {

    fun show(context : Context , message : String)
    {
        Toast.makeText(context , message , Toast.LENGTH_SHORT).show()
    }

}