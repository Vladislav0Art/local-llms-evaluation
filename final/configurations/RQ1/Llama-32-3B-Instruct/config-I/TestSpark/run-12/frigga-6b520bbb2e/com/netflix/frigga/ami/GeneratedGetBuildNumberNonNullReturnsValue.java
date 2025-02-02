package com.netflix.frigga.ami;

public class GeneratedGetBuildNumberNonNullReturnsValue {

    @Test
    public void getBuildNumberNonNullReturnsValue() {
        AppVersion appVersion = new AppVersion("other");
        Assert.assertEquals("other", appVersion.getBuildNumber());
    }

}