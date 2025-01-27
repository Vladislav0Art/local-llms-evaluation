package com.netflix.frigga.ami;

public class GeneratedGetPackageName_ReturnsExpectedName {

    @Test
    public void getPackageName_ReturnsExpectedName() {
        String packageName = AppVersion.getPackageName();
        assertNotNull(packageName);
        assertEquals(NameConstants.APP_VERSION_PACKAGE_NAME, packageName);
    }

}