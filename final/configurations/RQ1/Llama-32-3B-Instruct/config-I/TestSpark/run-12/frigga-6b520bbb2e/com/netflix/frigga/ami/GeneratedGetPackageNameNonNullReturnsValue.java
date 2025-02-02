package com.netflix.frigga.ami;

public class GeneratedGetPackageNameNonNullReturnsValue {

    @Test
    public void getPackageNameNonNullReturnsValue() {
        AppVersion appVersion = new AppVersion("other");
        Assert.assertEquals("other", appVersion.getPackageName());
    }

}