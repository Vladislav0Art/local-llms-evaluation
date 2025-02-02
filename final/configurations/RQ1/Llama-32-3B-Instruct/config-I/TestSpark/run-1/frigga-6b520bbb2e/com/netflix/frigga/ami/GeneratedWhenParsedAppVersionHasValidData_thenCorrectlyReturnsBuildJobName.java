package com.netflix.frigga.ami;

public class GeneratedWhenParsedAppVersionHasValidData_thenCorrectlyReturnsBuildJobName {

    @Test
    public void whenParsedAppVersionHasValidData_thenCorrectlyReturnsBuildJobName() {
        String amiName = "subscriberha-1.0.0-h150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals(appVersion.getBuildJobName(), "h150");
    }

}