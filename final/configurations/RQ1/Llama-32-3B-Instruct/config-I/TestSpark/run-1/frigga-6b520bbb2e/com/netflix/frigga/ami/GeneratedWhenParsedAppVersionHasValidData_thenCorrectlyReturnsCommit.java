package com.netflix.frigga.ami;

public class GeneratedWhenParsedAppVersionHasValidData_thenCorrectlyReturnsCommit {

    @Test
    public void whenParsedAppVersionHasValidData_thenCorrectlyReturnsCommit() {
        String amiName = "subscriberha-1.0.0-h150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        Assert.assertEquals(appVersion.getCommit(), "h150");
    }

}