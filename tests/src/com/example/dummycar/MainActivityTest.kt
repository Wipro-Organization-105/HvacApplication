package com.example.dummycar

import org.junit.Assert.assertEquals
import org.junit.Test

class MainActivityTest {

    @Test
    fun testAdd() {
        val activity = MainActivity()
        val result = activity.add(2, 3)
        assertEquals(5, result)
    }
}
