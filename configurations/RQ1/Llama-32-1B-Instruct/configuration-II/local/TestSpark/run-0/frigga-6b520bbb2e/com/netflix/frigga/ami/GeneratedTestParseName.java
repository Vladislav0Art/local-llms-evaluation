package com.netflix.frigga.ami;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        AppVersion version = new AppVersion();
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha", parsedVersion.packageName);
        assertEquals("1.0.0", parsedVersion.version);
    }

}