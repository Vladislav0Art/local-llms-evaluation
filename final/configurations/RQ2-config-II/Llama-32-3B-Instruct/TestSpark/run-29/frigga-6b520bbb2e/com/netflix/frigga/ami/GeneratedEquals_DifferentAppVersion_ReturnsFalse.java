package com.netflix.frigga.ami;

public class GeneratedEquals_DifferentAppVersion_ReturnsFalse {

    @Test
    public void equals_DifferentAppVersion_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("1.2.3-1234567890");
        AppVersion appVersion2 = new AppVersion("1.2.4-1234567890");
        assertFalse(appVersion1.equals(appVersion2));
    }

}