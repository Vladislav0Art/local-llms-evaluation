package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestToStringTest {

    @Test
    public void testToStringTest() {
        AppVersion app = AppVersion.parseName("myPackage-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        assertTrue(app.toString().charAt(0) == 'A');
    }

}