package com.netflix.frigga.ami;

public class GeneratedGetCommit_NullAppVersion_ReturnsNull {

    @Test
    public void getCommit_NullAppVersion_ReturnsNull() {
        AppVersion appVersion = null;
        assertNull(appVersion.getCommit());
    }

}