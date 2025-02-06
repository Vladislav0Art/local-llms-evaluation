package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_ValidAminoIsParsedCorrectly() {
        String amiName = "1.0.2-1234";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
        assertEquals("1.0.2", result.getVersion());
    }

    @Test
    public void parseName_InvalidAminoIsNotParsed() {
        String amiName = "InvalidAmino";
        AppVersion result = AppVersion.parseName(amiName);
        assertNull(result);
    }

    @Test
    public void compareTo_DifferentVersionsCompareCorrectly() {
        AppVersion version1 = new AppVersion("1.0.2-1234");
        AppVersion version2 = new AppVersion("1.0.3-5678");
        assertEquals(-1, version1.compareTo(version2));
    }

    @Test
    public void compareTo_SameVersionsCompareZero() {
        AppVersion version1 = new AppVersion("1.0.2-1234");
        AppVersion version2 = new AppVersion("1.0.2-1234");
        assertEquals(0, version1.compareTo(version2));
    }

    @Test
    public void getAppVersionPattern_ReturnsCorrectPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
        assertTrue(pattern.matcher("1.0.2-1234").find());
    }

    @Test
    public void getPackageName_ReturnsCorrectPackage() {
        String packageName = AppVersion.getPackageName();
        assertNotNull(packageName);
        assertEquals(NameConstants.PACKAGE_NAME, packageName);
    }

    @Test
    public void getVersion_ReturnsCorrectVersion() {
        String version = AppVersion.getVersion();
        assertNotNull(version);
        assertEquals("version", version);
    }

    @Test
    public void getBuildJobName_ReturnsCorrectBuildJobName() {
        String buildJobName = AppVersion.getBuildJobName();
        assertNotNull(buildJobName);
        assertEquals("buildJobName", buildJobName);
    }

    @Test
    public void getBuildNumber_ReturnsCorrectBuildNumber() {
        String buildNumber = AppVersion.getBuildNumber();
        assertNotNull(buildNumber);
        assertEquals("buildNumber", buildNumber);
    }

    @Test
    public void getCommit_ReturnsCorrectCommit() {
        String commit = AppVersion.getCommit();
        assertNotNull(commit);
        assertTrue(commit.matches("[a-zA-Z0-9]+$"));
    }

    @Test
    public void getChangelist_DeprecatedMethodThrowsUnsupportedOperationException() {
        new AppVersion().getChangelist();
    }

    @Test
    public void toString_ReturnsCorrectStringRepresentation() {
        String version = AppVersion.parseName("1.0.2-1234").toString();
        assertNotNull(version);
        assertEquals("version", version);
    }

    @Test
    public void hashCode_returnsCorrectHashCode() {
        AppVersion version1 = new AppVersion("1.0.2-1234");
        AppVersion version2 = new AppVersion("1.0.2-1234");
        assertNotEquals(version1.hashCode(), version2.hashCode());
    }

    @Test
    public void equals_ReturnsCorrectEqualityResult() {
        AppVersion version1 = new AppVersion("1.0.2-1234");
        AppVersion version2 = new AppVersion("1.0.2-1234");
        assertTrue(version1.equals(version2));
    }

}