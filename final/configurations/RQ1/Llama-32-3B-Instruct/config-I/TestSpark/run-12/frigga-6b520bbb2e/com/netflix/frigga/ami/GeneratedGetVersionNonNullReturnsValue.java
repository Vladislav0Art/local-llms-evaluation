package com.netflix.frigga.ami;

public class GeneratedGetVersionNonNullReturnsValue {

    @Test
    public void getVersionNonNullReturnsValue() {
        AppVersion appVersion = new AppVersion("other");
        Assert.assertEquals("other", appVersion.getVersion());
    }

}