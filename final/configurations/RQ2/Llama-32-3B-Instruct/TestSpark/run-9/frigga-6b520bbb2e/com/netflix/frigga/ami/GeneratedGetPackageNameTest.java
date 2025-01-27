package com.netflix.frigga.ami;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.APP_VERSION_PACKAGE, appVersion.getPackageName());
    }

}