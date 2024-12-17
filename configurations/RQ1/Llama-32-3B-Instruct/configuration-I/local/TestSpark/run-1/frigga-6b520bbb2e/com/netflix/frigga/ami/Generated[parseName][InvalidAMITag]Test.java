package com.netflix.frigga.ami;

public class Generated[parseName][InvalidAMITag]

Test {

    private AppVersion appVersion;

    @Test
    public void [parseName][InvalidAMITag]Test() {
        String amiName = "invalid";
        appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}