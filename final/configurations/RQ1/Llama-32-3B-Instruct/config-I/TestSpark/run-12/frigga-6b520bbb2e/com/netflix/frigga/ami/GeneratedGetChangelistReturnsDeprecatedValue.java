package com.netflix.frigga.ami;

public class GeneratedGetChangelistReturnsDeprecatedValue {

    @Test
    public void getChangelistReturnsDeprecatedValue() {
        AppVersion appVersion = new AppVersion("other");
        Assert.assertEquals("other", appVersion.getChangelist());
    }

}