package com.netflix.frigga.ami;

public class GeneratedDifferentAppVersionsShouldNotBeEqual {

    @Test
    public void differentAppVersionsShouldNotBeEqual() {
        AppVersion appVersion1 = AppVersion.parseName("subscriberha-1.0.0-586499");
        AppVersion appVersion2 = AppVersion.parseName("subscriberha-1.0.0-586500");
        assertFalse(appVersion1.equals(appVersion2));
    }

}