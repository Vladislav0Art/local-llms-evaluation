package com.netflix.frigga.ami;

public class GeneratedParseNameWithBuildJobNameReturnsNonNull {

    @Test
    public void parseNameWithBuildJobNameReturnsNonNull() {
        AppVersion parsed = AppVersion.parseName("subscriberha-1.0.0-586499.h150");
        Assert.assertNotNull(parsed);
        Assert.assertEquals("h150", parsed.buildJobName);
    }

}