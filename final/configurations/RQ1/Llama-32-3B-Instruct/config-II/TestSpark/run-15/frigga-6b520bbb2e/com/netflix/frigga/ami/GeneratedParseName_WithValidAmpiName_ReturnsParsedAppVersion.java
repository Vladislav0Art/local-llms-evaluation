package com.netflix.frigga.ami;

public class GeneratedParseName_WithValidAmpiName_ReturnsParsedAppVersion {

    @Test
    public void parseName_WithValidAmpiName_ReturnsParsedAppVersion() {
        // given
        String amiName = "subscriberha-1.0.0-586499";
        // when
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        // then
        Assert.assertNotNull(parsedAppVersion);
        Assert.assertEquals("subscriberha", parsedAppVersion.getPackageName());
        Assert.assertEquals("1.0.0-586499", parsedAppVersion.getVersion());
    }

}