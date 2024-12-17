package com.netflix.frigga.ami;

public class GeneratedTestParseName_NullAmiName {

    @Test
    public void testParseName_NullAmiName() {
        AppVersion appVersion = new AppVersion();

        assertThrows(NullPointerException.class, () -> appVersion.getPackageName());
    }

}