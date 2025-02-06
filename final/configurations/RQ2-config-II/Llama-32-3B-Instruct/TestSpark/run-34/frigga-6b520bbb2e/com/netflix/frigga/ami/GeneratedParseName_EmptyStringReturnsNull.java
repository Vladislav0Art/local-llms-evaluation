package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseName_EmptyStringReturnsNull {

    @Test
    public void parseName_EmptyStringReturnsNull() {
        String amiName = "";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}