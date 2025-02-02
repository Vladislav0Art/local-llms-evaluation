package com.netflix.frigga.ami;

public class GeneratedGetBuildJobNameNonNullReturnsValue {

    @Test
    public void getBuildJobNameNonNullReturnsValue() {
        AppVersion appVersion = new AppVersion("other");
        Assert.assertEquals("other", appVersion.getBuildJobName());
    }

}