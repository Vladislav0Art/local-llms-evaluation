package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPositive {

    @Test
    public void testPositive() {
        AppVersion appVersion = new AppVersion("1.2.3");
        assertFalse(appVersion.positive(true));
        assertTrue(appVersion.positive(false));

        appVersion = new AppVersion("4.5.6");
        assertTrue(appVersion.positive(true));
        assertFalse(appVersion.positive(false));
    }

}