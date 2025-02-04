package com.netflix.frigga.ami;

public class GeneratedSameAppVersionShouldBeEqual {

    @Test
    public void sameAppVersionShouldBeEqual() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertTrue(appVersion1.equals(appVersion2));
    }

}