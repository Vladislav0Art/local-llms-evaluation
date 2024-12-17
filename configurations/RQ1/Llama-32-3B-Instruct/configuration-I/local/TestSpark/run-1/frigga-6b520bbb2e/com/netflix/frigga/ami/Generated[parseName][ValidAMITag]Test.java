package com.netflix.frigga.ami;

public class Generated[parseName][ValidAMITag]

Test {

    private AppVersion appVersion;

    @Test
    public void [parseName][ValidAMITag]Test() {
        String amiName = "subscriberha-1.0.0-586499";
        appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.packageName);
        assertEquals("1.0.0-586499", appVersion.version);
    }

}