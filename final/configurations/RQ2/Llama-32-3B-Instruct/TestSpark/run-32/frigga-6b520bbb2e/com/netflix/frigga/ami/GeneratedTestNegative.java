package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNegative {

    @Test
    public void testNegative() {
        AppVersion appVersion = new AppVersion("1.2.3");
        assertTrue(appVersion.negative(true));
        assertFalse(appVersion.negative(false));

        appVersion = new AppVersion("4.5.6");
        assertTrue(appVersion.negative(false));
        assertFalse(appVersion.negative(true));
    }

}