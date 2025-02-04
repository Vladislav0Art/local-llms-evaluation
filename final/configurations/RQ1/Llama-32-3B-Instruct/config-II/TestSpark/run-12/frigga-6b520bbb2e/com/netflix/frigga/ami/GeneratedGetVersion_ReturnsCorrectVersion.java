package com.netflix.frigga.ami;

public class GeneratedGetVersion_ReturnsCorrectVersion {

    @Test
    public void getVersion_ReturnsCorrectVersion() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("1.0.0-586499", appVersion.getVersion());
    }

}