package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_[AnyString]

Test {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void getBuildNumber_[ AnyString]Test() {
        String buildNumber = "12345";
        appVersion = new AppVersion(buildNumber);
        assertEquals(buildNumber, appVersion.getBuildNumber());
    }

}