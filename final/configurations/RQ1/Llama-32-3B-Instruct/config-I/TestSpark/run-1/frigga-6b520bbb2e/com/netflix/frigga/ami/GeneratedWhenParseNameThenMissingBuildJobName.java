package com.netflix.frigga.ami;

public class GeneratedWhenParseNameThenMissingBuildJobName {

    @Test
    public void whenParseNameThenMissingBuildJobName() {
        String amiName = "subscriberha-1.0.0-586499.h150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNull(appVersion.getBuildJobName());
    }

}