package com.netflix.frigga.ami;

public class GeneratedParseNameValidPatternReturnsNonNull {

    @Test
    public void parseNameValidPatternReturnsNonNull() {
        AppVersion parsed = AppVersion.parseName("subscriberha-1.0.0-586499");
        Assert.assertNotNull(parsed);
        Assert.assertEquals("subscriberha", parsed.packageName);
        Assert.assertEquals("1.0.0-586499", parsed.version);
    }

}