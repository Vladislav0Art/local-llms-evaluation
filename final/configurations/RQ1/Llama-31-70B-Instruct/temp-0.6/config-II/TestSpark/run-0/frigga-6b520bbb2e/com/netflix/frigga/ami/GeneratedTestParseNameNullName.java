package com.netflix.frigga.ami;

public class GeneratedTestParseNameNullName {

    @Test
    public void testParseNameNullName() {
        AppVersion appVersion = AppVersion.parseName(null);
        Assert.assertNull(appVersion);
    }

}