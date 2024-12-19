package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private String amiName;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void testParseName_WithValidAppPattern_ReturnsParsedName() {
        when(APP_VERSION_PATTERN.matcher(amiName).matches()).thenReturn(true);
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
        assertEquals(amiName, parsedName.packageName);
        assertEquals(amiName, parsedName.version);
    }

    @Test
    public void testParseName_WithInvalidAppPattern_ReturnsNull() {
        when(APP_VERSION_PATTERN.matcher(amiName).matches()).thenReturn(false);
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

    @Test
    public void testCompareTo_SameObjects_ReturnsZero() {
        appVersion.setBuildJobName("hudson-1.0.0-586499");
        appVersion.setCommit("hudson-1.0.0-586499");
        AppVersion other = new AppVersion();
        other.setBuildJobName("hudson-1.0.0-586500");
        other.setCommit("hudson-1.0.0-586500");
        assertEquals(0, appVersion.compareTo(other));
    }

    @Test
    public void testCompareTo_DifferentObjects_ReturnsNegativeValue() {
        appVersion.setBuildJobName("hudson-1.0.0-586499");
        appVersion.setCommit("hudson-1.0.0-586500");
        AppVersion other = new AppVersion();
        other.setBuildJobName("hudson-1.0.0-586498");
        other.setCommit("hudson-1.0.0-586500");
        assertTrue(appVersion.compareTo(other) < 0);
    }

    @Test
    public void testGetPackageName() {
        appVersion.setBuildJobName("hudson-1.0.0-586499");
        appVersion.setCommit("hudson-1.0.0-586500");
        assertEquals("hudson", appVersion.getPackageName());
    }

    @Test
    public void testGetVersion() {
        appVersion.setBuildJobName("hudson-1.0.0-586499");
        appVersion.setCommit("hudson-1.0.0-586500");
        assertEquals("hudson-1.0.0-586499", appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName() {
        appVersion.setBuildJobName("hudson-1.0.0-586499");
        assertEquals("hudson-1.0.0-586499", appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber() {
        appVersion.setCommit("hudson-1.0.0-586500");
        assertEquals("hudson-1.0.0-586500", appVersion.getBuildNumber());
    }

    @Test
    public void testGetCommit() {
        appVersion.setBuildJobName("hudson-1.0.0-586499");
        assertEquals("hudson-1.0.0-586500", appVersion.getCommit());
    }

}