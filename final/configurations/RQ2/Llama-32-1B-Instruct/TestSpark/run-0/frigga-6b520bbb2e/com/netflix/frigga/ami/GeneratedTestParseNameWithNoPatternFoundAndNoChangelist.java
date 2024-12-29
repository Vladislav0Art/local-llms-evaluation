package com.netflix.frigga.ami;

public class GeneratedTestParseNameWithNoPatternFoundAndNoChangelist {

    private AppVersion appVersion;

    @Test
    public void testParseNameWithNoPatternFoundAndNoChangelist() {
        String amiName = "ami";
        appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion.getPackageName());
        assertNull(appVersion.getBuildJobName());
        assertNull(appVersion.getCommit());
        assertNull(appVersion.getChangelist());
    }

}