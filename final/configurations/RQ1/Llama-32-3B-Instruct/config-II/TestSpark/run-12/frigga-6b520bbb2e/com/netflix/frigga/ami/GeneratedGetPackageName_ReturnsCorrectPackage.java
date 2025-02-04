package com.netflix.frigga.ami;

public class GeneratedGetPackageName_ReturnsCorrectPackage {

    @Test
    public void getPackageName_ReturnsCorrectPackage() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("subscriberha", appVersion.getPackageName());
    }

}