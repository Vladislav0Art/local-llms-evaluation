package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_DoesNotMatchPatternReturnsNull {

    @Test
    public void parseName_DoesNotMatchPatternReturnsNull() {
        String amiName = "1.0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}