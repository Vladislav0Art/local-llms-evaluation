package com.netflix.frigga.ami;

public class GeneratedWhenParsedAppVersionHasValidData_thenCorrectlyReturnsVersion {

    @Test
    public void whenParsedAppVersionHasValidData_thenCorrectlyReturnsVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals(appVersion.getVersion(), "1.0.0-586499");
    }

}