package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testGetPackageName() {
        AppVersion version = new AppVersionImpl(AppVersionImpl.PACKAGES_NAME);
        assertEquals(AppVersionImpl.PACKAGES_NAME, version.getPackageName());
    }

    @Test
    public void testGetVersion() {
        AppVersion version = new AppVersionImpl(AppVersionImpl.VERSION_NAME);
        assertEquals(AppVersionImpl.VERSION_NAME, version.getVersion());
    }
}

public class GeneratedTest extends BaseTest implements AppVersion {
    @Override
    public String getPackageName() {
        return AppVersionImpl.PACKAGES_NAME;
    }

    @Override
    public int getVersion() {
        return AppVersionImpl.VERSION_NAME;
    }

}