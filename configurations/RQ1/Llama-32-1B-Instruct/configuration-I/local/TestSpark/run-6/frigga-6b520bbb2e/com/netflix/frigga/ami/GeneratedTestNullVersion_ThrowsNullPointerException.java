package com.netflix.frigga.ami;

public class GeneratedTestNullVersion_ThrowsNullPointerException {

    @Test
    public void testNullVersion_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion(null);
        assertThrows(NullPointerException.class, () -> appVersion.getVersion());
    }

}