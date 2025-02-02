package com.netflix.frigga.ami;

public class GeneratedGetPackageNameReturnsNull {

    @Test
    public void getPackageNameReturnsNull() {
        AppVersion appVersion = new AppVersion();
        Assert.assertNull(appVersion.getPackageName());
    }

}