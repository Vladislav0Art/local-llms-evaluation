package com.netflix.frigga.ami;

public class GeneratedGetCommit_returnsExpectedHash {

    @Test
    public void getCommit_returnsExpectedHash() {
        AppVersion appVersion = new AppVersion(123);
        assertEquals("expectedCommitHash", appVersion.getCommit());
    }

}