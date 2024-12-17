package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetPackageName_MatchesPattern {

    @MockAppVersion
    private AppVersion mockAppVersion;

    public void testParseName() {
        String amiName = "1234567890abcdef";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("1234567890abcdef", appVersion.getAmiName());
    }

    @Test
    public void testGetPackageName_MatchesPattern() {
        mockAppVersion.setAmiName("1234567890abcdef");
        AppVersion appVersion = AppVersion.parseName(mockAppVersion.getAmiName());
        assertEquals("1234567890abcdef", appVersion.getAmiName());
    }

}