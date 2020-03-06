package com.example.apprestapi.test

import com.example.apprestapi.Shared
import org.junit.Before
import org.junit.Test
import static org.junit.Assert.*;


class SharedTest   {
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
        assertEquals("-2", mShared.resta("3", "4"));
    }
}
