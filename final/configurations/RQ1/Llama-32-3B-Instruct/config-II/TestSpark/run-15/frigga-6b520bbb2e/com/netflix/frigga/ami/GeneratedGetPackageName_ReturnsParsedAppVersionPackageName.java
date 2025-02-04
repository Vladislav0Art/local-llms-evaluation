package com.netflix.frigga.ami;

public class GeneratedGetPackageName_ReturnsParsedAppVersionPackageName {

    @Test
    public void getPackageName_ReturnsParsedAppVersionPackageName() {
        // given
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        // when
        String packageName = parsedAppVersion.getPackageName();
        // then
        Assert.assertEquals("subscriberha", packageName);
    }

}