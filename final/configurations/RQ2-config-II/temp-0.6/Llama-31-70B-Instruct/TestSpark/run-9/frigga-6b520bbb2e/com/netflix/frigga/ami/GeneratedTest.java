package com.netflix.frigga.ami;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    private AppVersion appVersion;

    @BeforeEach
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testParseName() {
        String amiName = "amiName";
        AppVersion expected = Mockito.mock(AppVersion.class);
        when(expected.parseName(amiName)).thenReturn(expected);
        Assertions.assertEquals(expected, appVersion.parseName(amiName));
    }

    @Test
    public void testCompareTo() {
        AppVersion other = Mockito.mock(AppVersion.class);
        when(other.compareTo(appVersion)).thenReturn(0);
        Assertions.assertEquals(0, appVersion.compareTo(other));
    }

    @Test
    public void testGetAppVersionPattern() {
        Assertions.assertNotNull(appVersion.getAppVersionPattern());
    }

    @Test
    public void testGetPackageName() {
        Assertions.assertNull(appVersion.getPackageName());
    }

    @Test
    public void testGetVersion() {
        Assertions.assertNull(appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName() {
        Assertions.assertNull(appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber() {
        Assertions.assertNull(appVersion.getBuildNumber());
    }

}