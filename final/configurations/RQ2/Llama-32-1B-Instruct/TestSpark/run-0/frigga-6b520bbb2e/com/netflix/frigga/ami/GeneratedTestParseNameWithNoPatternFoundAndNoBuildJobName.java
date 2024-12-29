package com.netflix.frigga.ami;

public class GeneratedTestParseNameWithNoPatternFoundAndNoBuildJobName {

    private AppVersion appVersion;

    @Test
    public void testParseNameWithNoPatternFoundAndNoBuildJobName() {
        String amiName = "ami";
        appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion.getPackageName());
        assertNull(appVersion.getBuildJobName());
    }

}