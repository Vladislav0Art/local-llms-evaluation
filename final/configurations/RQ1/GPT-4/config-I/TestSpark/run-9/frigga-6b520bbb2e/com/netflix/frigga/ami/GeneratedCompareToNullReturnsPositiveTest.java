package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToNullReturnsPositiveTest {

    @Test
    public void compareToNullReturnsPositiveTest() {
        AppVersion app = AppVersion.parseName("myPackage-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        assertEquals(1, app.compareTo(null));
    }

}