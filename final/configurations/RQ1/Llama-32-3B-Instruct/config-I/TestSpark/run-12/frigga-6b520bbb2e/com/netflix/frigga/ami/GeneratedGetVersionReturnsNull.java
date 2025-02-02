package com.netflix.frigga.ami;

public class GeneratedGetVersionReturnsNull {

    @Test
    public void getVersionReturnsNull() {
        AppVersion appVersion = new AppVersion();
        Assert.assertNull(appVersion.getVersion());
    }

}