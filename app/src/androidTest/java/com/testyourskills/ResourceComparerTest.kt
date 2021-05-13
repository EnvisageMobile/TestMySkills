package com.testyourskills

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Test


class ResourceComparerTest{
   private val resourceComparer=ResourceComparer()

    @Test
    fun stringResourceSameAsPassString_returnTrue(){
        val context=ApplicationProvider.getApplicationContext<Context>()
        val result=resourceComparer.isEqual(context,R.string.app_name,"TestMySkills")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceSameAsPassString_returnFalse(){
        val context=ApplicationProvider.getApplicationContext<Context>()
        val result=resourceComparer.isEqual(context,R.string.app_name,"Skills")
        assertThat(result).isFalse()
    }
}