package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void parseName_ValidAmiName_ReturnsParsedAppVersion() {
        String amiName = "1.0-1234567890";
        when(AppVersion.parseName(amiName)).thenReturn(new AppVersion("com.netflix.frigga", "1.0", "1234567890"));
    }

    @Test
    public void parseName_InvalidAmiName_ReturnsNull() {
        String amiName = "";
        when(AppVersion.parseName(amiName)).thenReturn(null);
    }

    @Test
    public void compareTo_DifferentAppVersions_ReturnsNegativeInteger() {
        AppVersion appVersion1 = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        AppVersion appVersion2 = new AppVersion("com.netflix.frigga", "2.0", "9876543210");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareTo_SameAppVersions_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        AppVersion appVersion2 = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPattern_ReturnsAppVersionPattern() {
        when(AppVersion.getAppVersionPattern()).thenReturn(Pattern.compile("^[a-zA-Z]+\\.[0-9]+$"));
    }

    @Test
    public void getPackageName_ReturnsPackageName() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals("com.netflix.frigga", appVersion.getPackageName());
    }

    @Test
    public void getVersion_ReturnsVersion() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals("1.0", appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals("1234567890", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_ReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals("1234567890", appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_ReturnsCommit() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals("1234567890", appVersion.getCommit());
    }

    @Test
    public void getChangelist

    Deprecated() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assert appVersion.getChangelist() == null;
    }

    @Test
    public void toString_ReturnsToStringRepresentation() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals("com.netflix.frigga-1.0-1234567890", appVersion.toString());
    }

    @Test
    public void hashCode_ReturnsHashcode() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals(23, appVersion.hashCode());
    }

    @Test
    public void equals_AppVersionEqualsSameAppVersion_ReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        AppVersion appVersion2 = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equals_AppVersionEqualsDifferentAppVersion_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        AppVersion appVersion2 = new AppVersion("com.netflix.frigga", "2.0", "9876543210");
        assertFalse(appVersion1.equals(appVersion2));
    }

}