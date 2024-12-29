package com.netflix.frigga.ami;

public class GeneratedTestParseNameWithNoPatternFoundAndNoCommit {

    private AppVersion appVersion;

    @Test
    public void testParseNameWithNoPatternFoundAndNoCommit() {
        String amiName = "ami";
        appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion.getPackageName());
        assertNull(appVersion.getBuildJobName());
        assertNull(appVersion.getCommit());
    }

}