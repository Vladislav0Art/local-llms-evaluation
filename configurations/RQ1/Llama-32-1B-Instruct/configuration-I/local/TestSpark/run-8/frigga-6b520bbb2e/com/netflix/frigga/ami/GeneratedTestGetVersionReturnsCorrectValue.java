package com.netflix.frigga.ami;

import static org.junit.Assert.*;

public class GeneratedTestGetVersionReturnsCorrectValue {

    @Test
    public void testGetVersionReturnsCorrectValue() {
        String expected = "1.0.0";
        AppVersion appVersion = new AppVersion("1.9.0", "a1b2c3d4", 20220101);
        assertEquals(expected, appVersion.getVersion());
    }

}