package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameFromEmptyStringReturnsNull() {
        assertNull(AppVersion.parseName(""));
    }

    @Test
    public void parseNameWithInvalidFormatThrowsException() {
        assertThrows(Exception.class, () -> AppVersion.parseName("InvalidFormat"));
    }

    @Test
    public void parseNameWithValidFormatReturnsAppVersion() {
        AppVersion appVersion = AppVersion.parseName("1.2.3-ami-amzn2");
        assertNotNull(appVersion);
    }

    @Test
    public void getVersionReturnsVersionNumber() {
        AppVersion appVersion = AppVersion.parseName("1.2.3-ami-amzn2");
        assertEquals("1.2.3", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameReturnsJobName() {
        AppVersion appVersion = AppVersion.parseName("1.2.3-ami-amzn2");
        assertEquals("ami-amzn2", appVersion.getBuildJobName());
    }

    @Test
    public void getCommitReturnsCommitHash() {
        AppVersion appVersion = AppVersion.parseName("1.2.3-ami-amzn2");
        assertNotNull(appVersion.getCommit());
    }

    @Test
    public void getBuildNumberReturnsBuildNumber() {
        AppVersion appVersion = AppVersion.parseName("1.2.3-ami-amzn2");
        assertEquals("1.2.3", appVersion.getBuildNumber());
    }

    @Test
    public void getAppVersionPatternReturnsCorrectRegex() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("1.2.3-ami-amzn2").matches());
    }

}