package com.netflix.frigga.ami;

public class GeneratedHashCode_ValidAppVersion_ReturnsUniqueHashCode {

    @Test
    public void hashCode_ValidAppVersion_ReturnsUniqueHashCode() {
        AppVersion appVersion1 = new AppVersion("1.2.3-1234567890");
        AppVersion appVersion2 = new AppVersion("1.2.3-1234567890");
        assertEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

}