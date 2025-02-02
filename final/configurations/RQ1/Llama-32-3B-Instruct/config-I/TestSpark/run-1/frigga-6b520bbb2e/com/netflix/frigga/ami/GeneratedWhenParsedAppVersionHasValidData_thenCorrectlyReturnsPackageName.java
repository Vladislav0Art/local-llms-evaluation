package com.netflix.frigga.ami;

public class GeneratedWhenParsedAppVersionHasValidData_thenCorrectlyReturnsPackageName {

    @Test
    public void whenParsedAppVersionHasValidData_thenCorrectlyReturnsPackageName() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals(appVersion.getPackageName(), "subscriberha");
    }

}