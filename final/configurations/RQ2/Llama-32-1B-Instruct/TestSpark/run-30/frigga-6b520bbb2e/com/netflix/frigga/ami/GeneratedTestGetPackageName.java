package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    @Test
    public void testGetPackageName() {
        AppVersion version = new AppVersionImpl(AppVersionImpl.PACKAGES_NAME);
        assertEquals(AppVersionImpl.PACKAGES_NAME, version.getPackageName());
    }

}