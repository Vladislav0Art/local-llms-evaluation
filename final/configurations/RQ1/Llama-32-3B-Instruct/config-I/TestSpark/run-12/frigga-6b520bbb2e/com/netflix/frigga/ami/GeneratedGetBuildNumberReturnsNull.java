package com.netflix.frigga.ami;

public class GeneratedGetBuildNumberReturnsNull {

    @Test
    public void getBuildNumberReturnsNull() {
        AppVersion appVersion = new AppVersion();
        Assert.assertNull(appVersion.getBuildNumber());
    }

}