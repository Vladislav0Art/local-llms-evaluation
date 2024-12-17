package com.netflix.frigga.ami;

public class Generated[getPackageName][NotNull]

Test {

    private AppVersion appVersion;

    @Test
    public void [getPackageName][NotNull]Test() {
        AppVersion appVersion = new AppVersion();
        appVersion.packageName = "subscriberha";
        assertNotNull(appVersion.getPackageName());
        assertEquals("subscriberha", appVersion.getPackageName());
    }

}