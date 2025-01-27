package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_ValidInput_ReturnsParsedAppVersion() {
        String amiName = "1.0-1";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
    }

    @Test
    public void parseName_InvalidInput_ReturnsNull() {
        String amiName = " invalid input ";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion("1.0-1");
        AppVersion appVersion2 = new AppVersion("1.0-1");
        int comparisonResult = appVersion1.compareTo(appVersion2);
        assertEquals(0, comparisonResult);
    }

    @Test
    public void compareTo_DifferentAppVersions_ReturnsNegativeIndex() {
        AppVersion appVersion1 = new AppVersion("1.0-1");
        AppVersion appVersion2 = new AppVersion("1.1-2");
        int comparisonResult = appVersion1.compareTo(appVersion2);
        assertTrue(comparisonResult < 0);
    }

    @Test
    public void getAppVersionPattern_ReturnsPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
        assertTrue(pattern.matcher("1.0-1").find());
    }

    @Test
    public void getPackageName_ValidInput_ReturnsPackageName() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String packageName = appVersion.getPackageName();
        assertEquals(NameConstants.APP_VERSION, packageName);
    }

    @Test
    public void getVersion_ValidInput_ReturnsVersion() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String version = appVersion.getVersion();
        assertEquals("1.0", version);
    }

    @Test
    public void getBuildJobName_ValidInput_ReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String buildJobName = appVersion.getBuildJobName();
        assertEquals("build-number", buildJobName);
    }

    @Test
    public void getBuildNumber_ValidInput_ReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String buildNumber = appVersion.getBuildNumber();
        assertEquals("1", buildNumber);
    }

    @Test
    public void getCommit_ValidInput_ReturnsCommit() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String commit = appVersion.getCommit();
        assertNotNull(commit);
    }

    @Test
    public void getChangelist_ValidInput_ReturnsChangelist() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String changelist = appVersion.getChangelist();
        assertNotNull(changelist);
    }

    @Test
    public void toString_ValidAppVersion_ReturnstoString() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String toString = appVersion.toString();
        assertNotNull(toString);
    }

    @Test
    public void hashCode_ValidAppVersion_ReturnsHashcode() {
        AppVersion appVersion = new AppVersion("1.0-1");
        int hashcode = appVersion.hashCode();
        assertTrue(hashcode > 0);
    }

    @Test
    public void equals_SameAppVersion_ReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("1.0-1");
        AppVersion appVersion2 = new AppVersion("1.0-1");
        boolean equalsResult = appVersion1.equals(appVersion2);
        assertTrue(equalsResult);
    }

    @Test
    public void equals_DifferentAppVersions_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("1.0-1");
        AppVersion appVersion2 = new AppVersion("1.1-2");
        boolean equalsResult = appVersion1.equals(appVersion2);
        assertFalse(equalsResult);
    }

}