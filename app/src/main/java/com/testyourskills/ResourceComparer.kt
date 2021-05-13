package com.testyourskills

import android.content.Context

class ResourceComparer {

    fun isEqual(context:Context,resId:Int,str: String):Boolean{
        return  context.getString(R.string.app_name)==str
    }
}