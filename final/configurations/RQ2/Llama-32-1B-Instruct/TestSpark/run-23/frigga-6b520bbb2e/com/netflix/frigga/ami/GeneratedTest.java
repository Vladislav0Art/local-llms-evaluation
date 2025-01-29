package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testParseName() {
        AppVersion appVersion = AppVersion.parseName("ami123");
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getPackageName());
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getVersion());
    }

    @Test
    public void testParseName_Invalid() {
        String invalidName = "amiabc";
        AppVersion appVersion = AppVersion.parseName(invalidName);
        Mockito.when(AppVersion.parseName.in(sameString As String)).thenReturn(null);
        assertEquals(null, appVersion.getPackageName());
        assertEquals(null, appVersion.getVersion());
    }

    @Test
    public void testGetAppVersionPattern() {
        AppVersion appVersion = new AppVersion();
        Pattern pattern = appVersion.getAppVersionPattern();
        Mockito.when(AppVersion.getAppVersionPattern().matches(sameString As String)).thenReturn(true);
        assertTrue(pattern.matches("AMAZON-ECS-"));
    }

    @Test
    public void testGetAppVersionPattern_Invalid() {
        Mockito.when(AppVersion.getAppVersionPattern().matches(sameString As String)).thenReturn(false);
        assertFalse(AppVersion.getAppVersionPattern().matches("AMAZON-ECS-"));
    }

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getPackageName());
        Mockito.when(AppVersion.getPackageName()).thenReturn(sameString As String);
        assertEquals(sameString As String, appVersion.getPackageName());
    }

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getVersion());
        Mockito.when(AppVersion.getVersion()).thenReturn(sameString As String);
        assertEquals(sameString As String, appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getBuildJobName());
        Mockito.when(AppVersion.getBuildJobName()).thenReturn(sameString As String);
        assertEquals(sameString As String, appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getBuildNumber());
        Mockito.when(AppVersion.getBuildNumber()).thenReturn(sameString As String);
        assertEquals(sameString As String, appVersion.getBuildNumber());
    }

    @Test
    public void testGetCommit() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getCommit());
        Mockito.when(AppVersion.getCommit()).thenReturn(sameString As String);
        assertEquals(sameString As String, appVersion.getCommit());
    }

    @Test
    public void testGetChangelist() {
        AppVersion appVersion = new AppVersion();
        assertEquals(null, appVersion.getChangelist()); // DEPRECATED
        Mockito.when(AppVersion.getChangelist()).thenReturn(sameString As String);
        assertEquals(sameString As String, appVersion.getChangelist());
    }

    @Test
    public void testToString() {
        AppVersion appVersion = new AppVersion();
        String expectedString = NameConstants.AMI_VERSION_PREFIX + "123";
        Mockito.when(AppVersion.toString()).thenReturn(expectedString);
        assertEquals(expectedString, appVersion.toString());
    }

    @Test
    public void testHashCode() {
        AppVersion appVersion = new AppVersion();
        int actualHashCode = appVersion.hashCode();
        Mockito.when(AppVersion.hashCode()).thenReturn(actualHashCode);
        assertEquals(actualHashCode, appVersion.hashCode());
    }

    @Test
    public void testEquals() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        appVersion1.setVersion("123");
        Mockito.when(AppVersion.compareTo(in sameObject As AppVersion)).thenReturn(true);
        assertTrue(appVersion1.equals(appVersion2));
        Mockito.when(AppVersion.compareTo(in null As AppVersion)).thenReturn(false);
    }

    @Test
    public void testParseName_Invalid_Invalid() {
        String invalidName = "ami123";
        Mockito.when(AppVersion.parseName.in(sameString As String)).thenReturn(null);
        assertEquals(null, AppVersion.parseName(invalidName).getPackageName());
        assertEquals(null, AppVersion.parseName(invalidName).getVersion());
    }

    @Test
    public void testGetAppVersionPattern_Invalid_Invalid() {
        Mockito.when(AppVersion.getAppVersionPattern().matches(sameString As String)).thenReturn(false);
        assertFalse(AppVersion.getAppVersionPattern().matches("AMAZON-ECS-"));
    }

}