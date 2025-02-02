package com.netflix.frigga.ami;

public class GeneratedGetCommitReturnsNull {

    @Test
    public void getCommitReturnsNull() {
        AppVersion appVersion = new AppVersion();
        Assert.assertNull(appVersion.getCommit());
    }

}