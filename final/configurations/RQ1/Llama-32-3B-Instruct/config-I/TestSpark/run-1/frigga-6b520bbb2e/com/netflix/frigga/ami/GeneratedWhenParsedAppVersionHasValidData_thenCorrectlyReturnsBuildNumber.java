package com.netflix.frigga.ami;

public class GeneratedWhenParsedAppVersionHasValidData_thenCorrectlyReturnsBuildNumber {

    @Test
    public void whenParsedAppVersionHasValidData_thenCorrectlyReturnsBuildNumber() {
        String amiName = "subscriberha-1.0.0-h150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals(appVersion.getBuildNumber(), "h150");
    }

}