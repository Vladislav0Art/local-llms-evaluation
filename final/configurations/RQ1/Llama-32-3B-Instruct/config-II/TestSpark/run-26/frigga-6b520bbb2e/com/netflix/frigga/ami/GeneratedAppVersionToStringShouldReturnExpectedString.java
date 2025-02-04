package com.netflix.frigga.ami;

public class GeneratedAppVersionToStringShouldReturnExpectedString {

    @Test
    public void appVersionToStringShouldReturnExpectedString() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        String expectedString = "AppVersion [packageName=subscriberha, version=1.0.0-586499, buildJobName=null, buildNumber=null, changelist=null]";
        assertEquals(expectedString, appVersion.toString());
    }

}