package com.netflix.frigga.ami;

public class GeneratedParseNameWithCommitIdReturnsNonNull {

    @Test
    public void parseNameWithCommitIdReturnsNonNull() {
        AppVersion parsed = AppVersion.parseName("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        Assert.assertNotNull(parsed);
        Assert.assertEquals("150", parsed.commit);
    }

}