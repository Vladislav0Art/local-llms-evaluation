package com.netflix.frigga.ami;

public class GeneratedTestParseName {

    private AppVersion appVersion;

    @Test
    public void testParseName() {
        String amiName = "my-ami-name";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
        assertEquals(appVersion, parsedAppVersion);
    }

}