package com.netflix.frigga.ami;

public class GeneratedGetChangelist_ReturnsCorrectChangelist {

    @Test
    public void getChangelist_ReturnsCorrectChangelist() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("586499", appVersion.getChangelist());
    }

}