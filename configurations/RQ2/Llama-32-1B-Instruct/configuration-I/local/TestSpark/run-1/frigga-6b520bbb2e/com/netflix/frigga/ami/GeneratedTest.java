package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @MockAppVersion
    private AppVersion mockAppVersion;

    public void testParseName() {
        String amiName = "1234567890abcdef";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("1234567890abcdef", appVersion.getAmiName());
    }

    @Test
    public void testGetPackageName_ThrowsNullPointerException_WhenNullAMIName() {
        try {
            AppVersion.parseName(null);
            assert false;
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testGetPackageName_MatchesPattern() {
        mockAppVersion.setAmiName("1234567890abcdef");
        AppVersion appVersion = AppVersion.parseName(mockAppVersion.getAmiName());
        assertEquals("1234567890abcdef", appVersion.getAmiName());
    }

    @Test
    public void testGetVersion_MatchesPattern() {
        mockAppVersion.setAmiName("1.2.3.4.5.6");
        AppVersion appVersion = AppVersion.parseName(mockAppVersion.getAmiName());
        assertEquals("1.2.3.4.5.6", appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName_MatchesPattern() {
        mockAppVersion.setAmiName("1234567890abcdef");
        AppVersion appVersion = AppVersion.parseName(mockAppVersion.getAmiName());
        assertEquals("", appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber_MatchesPattern() {
        mockAppVersion.setAmiName("1.2.3.4.5.6");
        AppVersion appVersion = AppVersion.parseName(mockAppVersion.getAmiName());
        assertEquals("", appVersion.getBuildNumber());
    }

    @Test
    public void testGetCommit_MatchesPattern() {
        mockAppVersion.setAmiName("1234567890abcdef");
        AppVersion appVersion = AppVersion.parseName(mockAppVersion.getAmiName());
        assertEquals("", appVersion.getCommit());
    }

}