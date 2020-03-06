package com.example.apprestapi.test;

import android.content.Context;

import com.example.apprestapi.Shared;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private Shared mShared;

    @Before
    public void setUp(){
        mShared = new Shared();
    }

    @Test
    public void sharedNotNull(){
        assertNotNull(mShared);
    }
    @Test
    public void testSuma() throws Exception {
        assertEquals("7", mShared.suma("3", "4"));
    }
    @Test
    public void testResta() throws Exception{
        assertEquals("-2", mShared.resta("3", "5"));
    }
}
