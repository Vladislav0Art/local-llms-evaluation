package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        AppVersion result = AppVersion.parseName("");
        assertNull(result);
    }

    @Test
    public void parseName_NullString_ThrowsNullPointerException() {
        try {
            AppVersion.parseName(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void parseName_ValidString_ReturnsAppVersion() {
        String amiName = "ami-name-1.2.3";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
        assertEquals(amiName, result.toString());
    }

    @Test
    public void compareTo_SameVersion_ReturnsZero() {
        AppVersion version1 = AppVersion.parseName("ami-name-1.2.3");
        AppVersion version2 = AppVersion.parseName("ami-name-1.2.3");
        int result = version1.compareTo(version2);
        assertEquals(0, result);
    }

    @Test
    public void compareTo_LessVersion_ReturnsNegative() {
        AppVersion version1 = AppVersion.parseName("ami-name-1.2.3");
        AppVersion version2 = AppVersion.parseName("ami-name-1.2.2");
        int result = version1.compareTo(version2);
        assertTrue(result < 0);
    }

    @Test
    public void compareTo_GreaterVersion_ReturnsPositive() {
        AppVersion version1 = AppVersion.parseName("ami-name-1.2.3");
        AppVersion version2 = AppVersion.parseName("ami-name-1.2.4");
        int result = version1.compareTo(version2);
        assertTrue(result > 0);
    }

    @Test
    public void getAppVersionPattern_ReturnsPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageName_ReturnsPackageName() {
        AppVersion version = AppVersion.parseName("ami-name-1.2.3");
        String packageName = version.getPackageName();
        assertNotNull(packageName);
        assertEquals("ami-name", packageName);
    }

}