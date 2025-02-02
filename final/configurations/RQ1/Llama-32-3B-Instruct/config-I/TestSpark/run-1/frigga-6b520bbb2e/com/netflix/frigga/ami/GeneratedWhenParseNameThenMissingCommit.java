package com.netflix.frigga.ami;

public class GeneratedWhenParseNameThenMissingCommit {

    @Test
    public void whenParseNameThenMissingCommit() {
        String amiName = "subscriberha-1.0.0-h150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertNull(appVersion.getCommit());
    }

}