package com.netflix.frigga.ami;

public class GeneratedGetBuildJobNameReturnsNull {

    @Test
    public void getBuildJobNameReturnsNull() {
        AppVersion appVersion = new AppVersion();
        Assert.assertNull(appVersion.getBuildJobName());
    }

}