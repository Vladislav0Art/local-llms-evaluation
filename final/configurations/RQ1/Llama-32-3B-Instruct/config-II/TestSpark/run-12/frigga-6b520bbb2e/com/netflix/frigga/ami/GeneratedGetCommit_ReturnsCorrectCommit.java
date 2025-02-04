package com.netflix.frigga.ami;

public class GeneratedGetCommit_ReturnsCorrectCommit {

    @Test
    public void getCommit_ReturnsCorrectCommit() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("586499", appVersion.getCommit());
    }

}