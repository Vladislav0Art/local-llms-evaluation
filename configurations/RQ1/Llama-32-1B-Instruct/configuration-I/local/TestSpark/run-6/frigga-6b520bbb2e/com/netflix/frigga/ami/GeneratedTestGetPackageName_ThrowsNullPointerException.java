package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName_ThrowsNullPointerException {

    @Test
    public void testGetPackageName_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.getPackageName();

        assertThrows(NullPointerException.class, () -> appVersion.getPackageName());
    }

}