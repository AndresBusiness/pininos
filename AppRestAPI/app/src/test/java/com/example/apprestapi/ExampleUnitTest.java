package com.example.apprestapi;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void esto_siempre_pasa(){
        assertTrue(5 > 1);
    }
    @Test
    public void esto_nunca_pasa(){
        assertTrue(5 < 1);
    }

}