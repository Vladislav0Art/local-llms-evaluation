package com.netflix.frigga.ami;

public class GeneratedEquals_ValidAppVersion_ReturnsExpectedResult {

    @Test
    public void equals_ValidAppVersion_ReturnsExpectedResult() {
        AppVersion appVersion1 = new AppVersion("1.2.3-1234567890");
        AppVersion appVersion2 = new AppVersion("1.2.3-1234567890");
        assertTrue(appVersion1.equals(appVersion2));
    }

}