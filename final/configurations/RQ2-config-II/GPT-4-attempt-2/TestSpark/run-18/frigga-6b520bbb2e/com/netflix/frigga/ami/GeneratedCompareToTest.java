package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("com.netflix.package-1.0.0-h0.abc123");
        AppVersion appVersion2 = AppVersion.parseName("com.netflix.package-2.0.0-h0.abc123");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}