package com.mql.msglib

import android.content.Context
import android.widget.Toast

object MsgUtil {
    fun showMsg(context: Context, msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}