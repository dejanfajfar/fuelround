package com.fajfar.fuelround

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        print(get_round(1.112))
    }

    fun get_round(price: Double): List<Int> {
        var retVal = mutableListOf<Int>()
        for (volume in 3..800){
            var intermediatePrice = volume * price

            if ((intermediatePrice - Math.floor(intermediatePrice)).equals(0.0)){
                retVal.add(volume)
            }
        }

        return retVal
    }
}