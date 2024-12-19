package com.netflix.frigga.ami;

public class GeneratedGetPackageName_returnsExpectedValue {

    @Test
    public void getPackageName_returnsExpectedValue() {
        AppVersion appVersion = new AppVersion(123);
        assertEquals("expectedPackage", appVersion.getPackageName());
    }

}