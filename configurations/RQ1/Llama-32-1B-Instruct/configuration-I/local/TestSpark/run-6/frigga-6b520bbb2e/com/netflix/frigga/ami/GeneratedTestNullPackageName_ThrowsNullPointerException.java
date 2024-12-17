package com.netflix.frigga.ami;

public class GeneratedTestNullPackageName_ThrowsNullPointerException {

    @Test
    public void testNullPackageName_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("");

        assertThrows(NullPointerException.class, () -> appVersion.getPackageName());
    }

}