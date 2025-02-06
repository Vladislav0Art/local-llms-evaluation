package com.netflix.frigga.ami;

public class GeneratedToString_ValidAppVersion_ReturnsExpectedString {

    @Test
    public void toString_ValidAppVersion_ReturnsExpectedString() {
        AppVersion appVersion = new AppVersion("1.2.3-1234567890");
        assertEquals("1.2.3-1234567890", appVersion.toString());
    }

}