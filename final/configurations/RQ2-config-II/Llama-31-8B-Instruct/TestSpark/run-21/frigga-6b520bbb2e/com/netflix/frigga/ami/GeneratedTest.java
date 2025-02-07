package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        AppVersion result = AppVersion.parseName("");
        assertNull(result);
    }

    @Test
    public void parseName_NullString_ReturnsNull() {
        AppVersion result = AppVersion.parseName(null);
        assertNull(result);
    }

    @Test
    public void parseName_ValidString_ReturnsAppVersion() {
        String amiName = "ami-1234567890";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
    }

    @Test
    public void compareTo_SameVersion_ReturnsZero() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion();
        int result = version1.compareTo(version2);
        assertEquals(0, result);
    }

    @Test
    public void compareTo_LessThanVersion_ReturnsNegative() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion();
        version2.setVersion("1.2.3");
        int result = version1.compareTo(version2);
        assertTrue(result < 0);
    }

    @Test
    public void compareTo_GreaterThanVersion_ReturnsPositive() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion();
        version1.setVersion("1.2.3");
        int result = version1.compareTo(version2);
        assertTrue(result > 0);
    }

    @Test
    public void getAppVersionPattern_ReturnsPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

}