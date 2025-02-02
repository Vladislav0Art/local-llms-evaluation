package com.netflix.frigga.ami;

public class GeneratedWhenParseNameThenMissingBuildNumber {

    @Test
    public void whenParseNameThenMissingBuildNumber() {
        String amiName = "subscriberha-1.0.0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNull(appVersion.getBuildNumber());
    }

}