package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void testParseName() {
        AppVersion appVersion = new AppVersion(AppVersion.parseName("test-ami-name"));
        assertEquals("test-ami-name", appVersion.getPackageName());
    }

    @Test
    public void testGetPackageVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("test-ami-name").matches());
        assertFalse(pattern.matcher("another-test-ami-name").matches());
    }

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion(AppVersion.parseName("test-ami-version"));
        assertEquals("test-ami-version", appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion(AppVersion.parseName("test-build-job-name"));
        assertEquals("test-build-job-name", appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion(AppVersion.parseName("test-build-number"));
        assertEquals("test-build-number", appVersion.getBuildNumber());
    }

    @Test
    public void testGetCommit() {
        AppVersion appVersion = new AppVersion(AppVersion.parseName("test-commit"));
        assertEquals("test-commit", appVersion.getCommit());
    }

    @Test
    public void testGetChangelist() {
        String changelist = "test-changelist";
        assertTrue(AppVersion.getAppVersionPattern().matcher(changelist).matches());
        assertFalse(AppVersion.getAppVersionPattern().matcher(changelist + "-unknown").matches());
    }

    @Test
    public void testToString() {
        AppVersion appVersion = new AppVersion(AppVersion.parseName("test-ami-name"));
        assertEquals("test-ami-name", appVersion.toString());
    }

}