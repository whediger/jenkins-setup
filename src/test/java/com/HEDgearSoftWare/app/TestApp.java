package com.HEDgearSoftWare.app;

import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class TestApp
{
    App app = new App();
    private static double PI = 3.14159;


    @Test
    public void testReturnsPI(){

      assertEquals(PI, app.getPi(), 0.001);
    }
}
