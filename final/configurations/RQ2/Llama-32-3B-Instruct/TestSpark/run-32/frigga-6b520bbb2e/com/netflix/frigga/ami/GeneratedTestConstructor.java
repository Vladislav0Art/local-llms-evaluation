package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConstructor {

    @Test
    public void testConstructor() {
        AppVersion appVersion = new AppVersion("1.2.3");
        assertEquals("1.2.3", appVersion.version);

        appVersion = new AppVersion(123);
        assertEquals(String.valueOf(123), appVersion.version);
    }

}