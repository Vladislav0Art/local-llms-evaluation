package com.netflix.frigga.ami;

public class GeneratedAppVersionShouldHaveCorrectHashCode {

    @Test
    public void appVersionShouldHaveCorrectHashCode() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        int expectedHash = 12345;
        assertEquals(expectedHash, appVersion.hashCode());
    }

}