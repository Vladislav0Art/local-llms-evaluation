package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
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
            // expected
        }
    }

    @Test
    public void parseName_ValidString_ReturnsAppVersion() {
        String amiName = "ami-123456789012";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
    }

    @Test
    public void compareTo_SameVersion_ReturnsZero() {
        AppVersion version1 = AppVersion.parseName("ami-123456789012");
        AppVersion version2 = AppVersion.parseName("ami-123456789012");
        assertEquals(0, version1.compareTo(version2));
    }

    @Test
    public void compareTo_LessThanVersion_ReturnsNegative() {
        AppVersion version1 = AppVersion.parseName("ami-123456789012");
        AppVersion version2 = AppVersion.parseName("ami-123456789011");
        assertTrue(version1.compareTo(version2) < 0);
    }

    @Test
    public void compareTo_GreaterThanVersion_ReturnsPositive() {
        AppVersion version1 = AppVersion.parseName("ami-123456789012");
        AppVersion version2 = AppVersion.parseName("ami-123456789013");
        assertTrue(version1.compareTo(version2) > 0);
    }

    @Test
    public void getAppVersionPattern_ReturnsPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageName_EmptyString_ReturnsEmptyString() {
        AppVersion version = AppVersion.parseName("");
        assertEquals("", version.getPackageName());
    }

    @Test
    public void getPackageName_ValidString_ReturnsPackageName() {
        AppVersion version = AppVersion.parseName("ami-123456789012");
        assertEquals("ami", version.getPackageName());
    }

}