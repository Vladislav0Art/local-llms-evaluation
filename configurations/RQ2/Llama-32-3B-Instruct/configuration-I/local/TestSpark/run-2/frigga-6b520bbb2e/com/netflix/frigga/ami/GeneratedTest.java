package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void parseName_ValidAMIName_ReturnsCorrectAppVersion() {
        AppVersion appVersion = AppVersion.parseName("1.2.3-4");
        assertEquals(1, appVersion.getVersionPart());
        assertEquals(2, appVersion.getMinorVersion());
        assertEquals(3, appVersion.getPatchVersion());
        assertTrue(Collections.singletonMap("packageName", "com.example").equals(appVersion.getPackageName()));
    }

    @Test
    public void parseName_InvalidAMIName_ThrowsParseException() {
        try {
            AppVersion.parseName("1.2.3-4.");
            fail("Expected ParseException to be thrown");
        } catch (ParseException e) {
            // expected exception
        }
    }

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        int result = appVersion.compareTo(appVersion);
        assertEquals(0, result);
    }

    @Test
    public void compareTo_LesserAppVersion_ReturnsNegativeInt() {
        AppVersion appVersion1 = new AppVersion(1, 2, 3);
        AppVersion appVersion2 = new AppVersion(1, 1, 1);
        int result = appVersion1.compareTo(appVersion2);
        assertTrue(result < 0);
    }

    @Test
    public void compareTo_GreaterAppVersion_ReturnsPositiveInt() {
        AppVersion appVersion1 = new AppVersion(1, 2, 3);
        AppVersion appVersion2 = new AppVersion(1, 4, 6);
        int result = appVersion1.compareTo(appVersion2);
        assertTrue(result > 0);
    }

    @Test
    public void getAppVersionPattern_ContainsAMIDepartment() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("ami-12345678901").find());
    }

    @Test
    public void getPackageName_ReturnsCorrectName() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertEquals("com.example", appVersion.getPackageName());
    }

    @Test
    public void getVersion_ReturnsCorrectString() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertEquals("1.2.3", appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsEmptyString() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertTrue(appVersion.getBuildJobName().isEmpty());
    }

    @Test
    public void getBuildNumber_ReturnsCorrectString() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertEquals("12345", appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_ReturnsCorrectString() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertTrue(appVersion.getCommit().equals("abcd1234"));
    }

    @Test
    public void getChangelist_ThrowsDeprecatedException() {
        try {
            new AppVersion(1, 2, 3).getChangelist();
            fail("Expected DeprecatedException to be thrown");
        } catch (DeprecationWarning e) {
            // expected exception
        }
    }

    @Test
    public void toString_ReturnsCorrectString() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertEquals("ami-12345678901@1.2.3", appVersion.toString());
    }

    @Test
    public void hashCode_ReturnsCorrectHashcode() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertTrue(appVersion.hashCode() == 12345);
    }

    @Test
    public void equals_SameAppVersion_ReturnsTrue() {
        AppVersion appVersion1 = new AppVersion(1, 2, 3);
        AppVersion appVersion2 = new AppVersion(1, 2, 3);
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equals_DifferentAppVersions_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion(1, 2, 3);
        AppVersion appVersion2 = new AppVersion(1, 4, 6);
        assertFalse(appVersion1.equals(appVersion2));
    }

}