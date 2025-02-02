package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedGetPackageName_ReturnsPackageName {

    @Test
    public void getPackageName_ReturnsPackageName() {
        AppVersion app = new AppVersion();
        app.packageName = "test";
        assertEquals("test", app.getPackageName());
    }

}