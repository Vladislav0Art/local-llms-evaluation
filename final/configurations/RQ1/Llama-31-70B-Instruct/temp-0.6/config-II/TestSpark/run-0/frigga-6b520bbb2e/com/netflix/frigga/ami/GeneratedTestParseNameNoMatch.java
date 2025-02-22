package com.netflix.frigga.ami;

public class GeneratedTestParseNameNoMatch {

    @Test
    public void testParseNameNoMatch() {
        AppVersion appVersion = AppVersion.parseName("foo");
        Assert.assertNull(appVersion);
    }

}