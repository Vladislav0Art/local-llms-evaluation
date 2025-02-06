package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_MatchesPatternReturnsValidAppVersion {

    @Test
    public void parseName_MatchesPatternReturnsValidAppVersion() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("-123456", appVersion.getCommit());
    }

}