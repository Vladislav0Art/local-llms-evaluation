package com.netflix.frigga.ami;

public class GeneratedTestGetVersion_ThrowsNullPointerException {

    @Test
    public void testGetVersion_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.getVersion();

        assertThrows(NullPointerException.class, () -> appVersion.getVersion());
    }

}