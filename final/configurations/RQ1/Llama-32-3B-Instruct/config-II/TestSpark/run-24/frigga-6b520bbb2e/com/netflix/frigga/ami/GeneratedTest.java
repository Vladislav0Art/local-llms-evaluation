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

    @InjectMocks
    private AppVersion appVersion;

    @Mock
    private Pattern appVersionPattern;

    @Test
    public void parseName_ValidAppVersion_ReturnsParsedName() {
        String amiName = "subscriberha-1.0.0-586499";
        when(appVersionPattern.matcher(amiName).matches()).thenReturn(true);
        AppVersion parsedName = AppVersion.parseName(amiName);

        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.packageName);
        assertEquals("1.0.0-586499", parsedName.version);
    }

    @Test
    public void parseName_InvalidAppVersion_ReturnsNull() {
        String amiName = "invalid";
        when(appVersionPattern.matcher(amiName).matches()).thenReturn(false);

        AppVersion parsedName = AppVersion.parseName(amiName);

        assertNull(parsedName);
    }

    @Test
    public void compareTo_ComparableAppVersions_CompareCorrectly() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.packageName = "a";
        appVersion1.version = "b";

        AppVersion appVersion2 = new AppVersion();
        appVersion2.packageName = "c";
        appVersion2.version = "d";

        assertEquals(0, appVersion.compareTo(appVersion1));
        assertEquals(-1, appVersion.compareTo(appVersion2));
    }

    @Test
    public void getPackageName_ReturnsPackageName() {
        appVersion.packageName = "a";
        assertEquals("a", appVersion.getPackageName());
    }

    @Test
    public void getPackageName_NullReturnsNull() {
        assertNull(appVersion.getPackageName());
    }

    @Test
    public void getVersion_ReturnsVersion() {
        appVersion.version = "a";
        assertEquals("a", appVersion.getVersion());
    }

    @Test
    public void getVersion_NullReturnsNull() {
        assertNull(appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsBuildJobName() {
        appVersion.buildJobName = "a";
        assertEquals("a", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildJobName_NullReturnsNull() {
        assertNull(appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_ReturnsBuildNumber() {
        appVersion.buildNumber = "a";
        assertEquals("a", appVersion.getBuildNumber());
    }

    @Test
    public void getBuildNumber_NullReturnsNull() {
        assertNull(appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_ReturnsCommit() {
        appVersion.commit = "a";
        assertEquals("a", appVersion.getCommit());
    }

    @Test
    public void getCommit_NullReturnsNull() {
        assertNull(appVersion.getCommit());
    }

}