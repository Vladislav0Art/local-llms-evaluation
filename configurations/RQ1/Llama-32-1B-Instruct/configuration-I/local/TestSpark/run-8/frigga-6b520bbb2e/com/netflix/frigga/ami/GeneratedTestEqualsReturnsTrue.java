package com.netflix.frigga.ami;

import static org.junit.Assert.*;

public class GeneratedTestEqualsReturnsTrue {

    @Test
    public void testEqualsReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("1.9.0", "a1b2c3d4", 20220101);
        AppVersion appVersion2 = new AppVersion("1.8.0", "a1b2c3d4", 20220102);
        assertTrue(appVersion1.equals(appVersion2));
    }

}