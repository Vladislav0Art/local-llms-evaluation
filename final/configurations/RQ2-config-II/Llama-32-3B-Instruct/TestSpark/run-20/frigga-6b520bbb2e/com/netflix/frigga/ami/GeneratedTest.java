package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private NameConstants nameConstants;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void getPackageName_AmiNameContainsPackage() {
        when(nameConstants.getPackagePrefix()).thenReturn("com.netflix.frigga.ami");
        assertEquals("com.netflix.frigga.ami", appVersion.getPackageName());
    }

    @Test
    public void getPackageName_AmiNameNotContainPackage() {
        when(nameConstants.getPackagePrefix()).thenReturn("");
        assertEquals("", appVersion.getPackageName());
    }

    @Test
    public void getVersion_AmiNameContainsVersion() {
        when(nameConstants.getVersionPattern()).thenReturn(".*\\d+\\.\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("1.2.3");
        assertTrue(matcher.find());
        assertEquals("1.2.3", appVersion.getVersion());
    }

    @Test
    public void getVersion_AmiNameNotContainVersion() {
        when(nameConstants.getVersionPattern()).thenReturn("");
        assertEquals("", appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_AmiNameContainsBuildJob() {
        when(nameConstants.getBuildJobNameRegex()).thenReturn(".*build\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("build123");
        assertTrue(matcher.find());
        assertEquals("build123", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_AmiNameContainsBuildNumber() {
        when(nameConstants.getBuildNumberRegex()).thenReturn(".*\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("123");
        assertTrue(matcher.find());
        assertEquals("123", appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_AmiNameContainsCommit() {
        when(nameConstants.getCommitRegex()).thenReturn(".*committable\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("commitable456");
        assertTrue(matcher.find());
        assertEquals("commitable456", appVersion.getCommit());
    }

    @Test
    public void getChangelist_AmiNameNotContainChangelist() {
        @Deprecated
                when(nameConstants.getChangelistRegex()).thenReturn("");
        assertEquals("", appVersion.getChangelist());
    }

    @Test
    public void getBuildJobName_AmiNameDoesNotContainBuildJob() {
        @Deprecated
                when(nameConstants.getBuildJobNameRegex()).thenReturn("");
        assertEquals("", appVersion.getBuildJobName());
    }

    @Test
    public void getVersion_AmiNameContainsMultipleVersions() {
        when(nameConstants.getVersionPattern()).thenReturn(".*\\d+\\.\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("1.2-3");
        assertTrue(matcher.find());
        assertEquals("1.2-3", appVersion.getVersion());
    }

    @Test
    public void getBuildNumber_AmiNameContainsMultipleBuildNumbers() {
        when(nameConstants.getBuildNumberRegex()).thenReturn(".*\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("123-456");
        assertTrue(matcher.find());
        assertEquals("123-456", appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_AmiNameContainsMultipleCommits() {
        when(nameConstants.getCommitRegex()).thenReturn(".*committable\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("commitable-456");
        assertTrue(matcher.find());
        assertEquals("commitable-456", appVersion.getCommit());
    }

    @Test
    public void getChangelist_AmiNameContainsChangelist() {
        @Deprecated
                when(nameConstants.getChangelistRegex()).thenReturn(".*changelist\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("changelist456");
        assertTrue(matcher.find());
        assertEquals("changelist456", appVersion.getChangelist());
    }

    @Test
    public void getBuildNumber_AmiNameContainsMultipleBuildNumbers() {
        when(nameConstants.getBuildNumberRegex()).thenReturn(".*\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("1234-5678");
        assertTrue(matcher.find());
        assertEquals("1234-5678", appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_AmiNameContainsMultipleCommits() {
        when(nameConstants.getCommitRegex()).thenReturn(".*committable\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("commitable-5678");
        assertTrue(matcher.find());
        assertEquals("commitable-5678", appVersion.getCommit());
    }

    @Test
    public void equals_AmiNameMatches() {
        AppVersion other = new AppVersion();
        when(other.toString()).thenReturn("com.netflix.frigga.ami/1.2.3/build123");
        assertTrue(appVersion.equals(other));
    }

    @Test
    public void equals_AmiNameDoesNotMatch() {
        AppVersion other = new AppVersion();
        when(other.toString()).thenReturn("com.netflix.frigga.another/1.2.3/build123");
        assertFalse(appVersion.equals(other));
    }

    @Test
    public void equalsNullObject() {
        assertFalse(appVersion.equals(null));
    }

}