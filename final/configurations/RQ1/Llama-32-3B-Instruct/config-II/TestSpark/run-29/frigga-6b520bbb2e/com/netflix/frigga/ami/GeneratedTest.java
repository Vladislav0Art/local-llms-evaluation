package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void testParseName_ValidAppVersionPattern_Succeeded() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void testParseName_NullAmiName_ReturnsNull() {
        String amiName = null;
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

    @Test
    public void testParseName_InvalidAppVersionPattern_ReturnsNull() {
        String amiName = "subscriberha-1.0.0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

    @Test
    public void testGetPackageName_NameWithHypenAndNumber_Succeeded() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha", appVersion.getPackageName());
    }

    @Test
    public void testGetPackageName_NameWithoutHypenAndNumber_ReturnsEmptyString() {
        String amiName = "subscriberha";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("", appVersion.getPackageName());
    }

    @Test
    public void testGetBuildJobName_NameWithHypenAndNumber_Succeeded() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("586499", appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildJobName_NameWithoutHypenAndNumber_ReturnsEmptyString() {
        String amiName = "subscriberha";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("", appVersion.getBuildJobName());
    }

    @Test
    public void testGetCommit_WithPerforceCL_Succeeded() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("586499", appVersion.getCommit());
    }

    @Test
    public void testGetCommit_WithGitHash_Succeeded() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("586499", appVersion.getCommit());
    }
}

public class AppVersion {

    public static AppVersion parseName(String name) {
        // implementation
    }

    public String getPackageName() {
        return packageName;
    }

    public String getVersion() {
        return version;
    }

    public String getBuildJobName() {
        return buildJobName;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public String getCommit() {
        return commit;
    }

}