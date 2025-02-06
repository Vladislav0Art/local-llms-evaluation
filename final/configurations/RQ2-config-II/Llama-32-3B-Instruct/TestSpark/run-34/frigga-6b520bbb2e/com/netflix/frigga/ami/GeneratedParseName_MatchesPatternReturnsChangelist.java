package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_MatchesPatternReturnsChangelist {

    @Test
    public void parseName_MatchesPatternReturnsChangelist() {
        String amiName = "1.0.0-123456";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion.getChangelist());
        assertEquals("123456", appVersion.getChangelist());
    }

}