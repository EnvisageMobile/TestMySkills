package com.testyourskills

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer

    @Before
    fun setup() {
        /*executes before every test case it reduce bolierplate code that creates instatnce*/
        resourceComparer = ResourceComparer()
    }

    @After
    fun teardown() {

    }

    @Test
    fun stringResourceSameAsPassString_returnTrue() {

        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "TestMySkills")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceSameAsPassString_returnFalse() {

        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "Skills")
        assertThat(result).isFalse()
    }
}