package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private String amiName;

    @Test
    public void parseName_BasicTest() {
        when(AppVersion.parseName(amiName)).thenReturn(new AppVersion("test", "test"));
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("test", appVersion.getPackageName());
        assertTrue(appVersion.getVersion().matches("\\d+")); // Simple regex to match version number
    }

    @Test
    public void parseName_InvalidInput_ReturnsNull() {
        when(AppVersion.parseName(amiName)).thenReturn(null);
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

    @Test
    public void getPackageName_GivenVersion_ReturnsVersion() {
        AppVersion appVersion = new AppVersion("test", "test");
        assertEquals("test", appVersion.getPackageName());
    }

    @Test
    public void getPackageName_NotGiven_ReturnsNull() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getPackageName());
    }

    @Test
    public void getBuildNumber_GivenBuildNumber_ReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion("test", "test");
        assertEquals("test", appVersion.getBuildNumber());
    }

    @Test
    public void getBuildNumber_NotGiven_ReturnsNull() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_GivenCommit_ReturnsCommit() {
        AppVersion appVersion = new AppVersion("test", "test");
        assertEquals("test", appVersion.getCommit());
    }

    @Test
    public void getCommit_NotGiven_ReturnsNull() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getCommit());
    }

}