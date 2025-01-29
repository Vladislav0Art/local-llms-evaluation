package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testParseName_SimpleName() {
        String expected = "latest";
        when(AppVersion.parseName(anyString())).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.parseName("latest"));
    }

    @Test
    public void testParseName_MultipleNames() {
        String[] expected = {"latest", NameConstants.AMI_VERSION};
        when(AppVersion.parseName(anyString())).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.parseName("latest"));
    }

    @Test
    public void testParseName_MultipleNames_NoMatch() {
        String[] expected = {"1234", "5"};
        when(AppVersion.parseName(anyString())).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.parseName("abc"));
    }

    @Test
    public void testGetPackageName_SimpleName() {
        String expected = NameConstants.AMI_VERSION;
        when(getAppVersionPattern()).thenReturn(Pattern.compile("^[a-zA-Z0-9]+$"), anyString());
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getPackageName());
    }

    @Test
    public void testGetPackageName_MultipleNames() {
        String[] expected = {"latest", NameConstants.AMI_VERSION};
        when(getAppVersionPattern()).thenReturn(Pattern.compile("^[a-zA-Z0-9]+$"), anyString());
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getPackageName());
    }

    @Test
    public void testGetPackageName_InvalidName() {
        String expected = "latest";
        when(getAppVersionPattern()).thenReturn(Pattern.compile("^[a-zA-Z0-9]+$"), anyString());
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getPackageName());
    }

    @Test
    public void testGetVersion_SimpleName() {
        String expected = NameConstants.AMI_VERSION;
        when(getVersion()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getVersion());
    }

    @Test
    public void testGetVersion_MultipleNames() {
        String[] expected = {"latest", NameConstants.AMI_VERSION};
        when(getVersion()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getVersion());
    }

    @Test
    public void testGetBuildJobName_SimpleName() {
        String expected = "latest";
        when(getBuildJobName()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildJobName_MultipleNames() {
        String[] expected = {"latest", NameConstants.AMI_VERSION};
        when(getBuildJobName()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber_SimpleName() {
        String expected = " latest";
        when(getBuildNumber()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getBuildNumber());
    }

    @Test
    public void testGetBuildNumber_MultipleNames() {
        String[] expected = {"latest", NameConstants.AMI_VERSION};
        when(getBuildNumber()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getBuildNumber());
    }

    @Test
    public void testGetCommit_SimpleName() {
        String expected = NameConstants.AMI_VERSION;
        when(getCommit()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getCommit());
    }

    @Test
    public void testGetCommit_MultipleNames() {
        String[] expected = {"latest", NameConstants.AMI_VERSION};
        when(getCommit()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getCommit());
    }

}