package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestHashCodeTest {

    @Test
    public void testHashCodeTest() {
        AppVersion app = AppVersion.parseName("myPackage-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        AppVersion app2 = AppVersion.parseName("myPackage-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        assertTrue(app.equals(app2) && app2.equals(app));
        assertTrue(app.hashCode() == app2.hashCode());
    }

}