package com.netflix.frigga.ami;

public class GeneratedParseName_WithMultipleGroups_ReturnsParsedAppVersion {

    @Test
    public void parseName_WithMultipleGroups_ReturnsParsedAppVersion() {
        // given
        String amiName = "subscriberha-1.0.0-586499.h150";
        // when
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        // then
        Assert.assertNotNull(parsedAppVersion);
        Assert.assertEquals("subscriberha", parsedAppVersion.getPackageName());
        Assert.assertEquals("1.0.0-586499", parsedAppVersion.getVersion());
    }

}