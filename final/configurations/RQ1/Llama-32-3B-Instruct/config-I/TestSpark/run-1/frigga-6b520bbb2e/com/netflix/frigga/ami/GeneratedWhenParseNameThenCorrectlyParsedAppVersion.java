package com.netflix.frigga.ami;

public class GeneratedWhenParseNameThenCorrectlyParsedAppVersion {

    @Test
    public void whenParseNameThenCorrectlyParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals(appVersion.getPackageName(), "subscriberha");
        Assert.assertEquals(appVersion.getVersion(), "1.0.0-586499");
    }

}