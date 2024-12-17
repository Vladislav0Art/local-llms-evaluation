package com.netflix.frigga.ami;

import static org.junit.Assert.*;

public class GeneratedTestToStringWithNullCommitReturnsCorrectValue {

    @Test
    public void testToStringWithNullCommitReturnsCorrectValue() {
        String expected = "AppVersion{appId=\"1.9.0\", commit=null}";
        AppVersion appVersion = new AppVersion("1.8.0", null, 20220102);
        assertEquals(expected, appVersion.toString());
    }

}