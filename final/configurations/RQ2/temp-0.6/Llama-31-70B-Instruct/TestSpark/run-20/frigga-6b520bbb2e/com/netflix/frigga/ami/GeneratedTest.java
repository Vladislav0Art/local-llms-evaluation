package com.netflix.frigga.ami;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testPackageName() {
        String packageName = "packageName";
        appVersion.setPackageName(packageName);
        assertEquals(packageName, appVersion.getPackageName());
    }

    @Test
    public void testVersion() {
        String version = "version";
        appVersion.setVersion(version);
        assertEquals(version, appVersion.getVersion());
    }

    @Test
    public void testBuildJobName() {
        String buildJobName = "buildJobName";
        appVersion.setBuildJobName(buildJobName);
        assertEquals(buildJobName, appVersion.getBuildJobName());
    }

    @Test
    public void testBuildNumber() {
        String buildNumber = "buildNumber";
        appVersion.setBuildNumber(buildNumber);
        assertEquals(buildNumber, appVersion.getBuildNumber());
    }

    @Test
    public void testCommit() {
        String commit = "commit";
        appVersion.setCommit(commit);
        assertEquals(commit, appVersion.getCommit());
    }

    @Test
    public void testChangelist() {
        String commit = "commit";
        appVersion.setCommit(commit);
        assertEquals(commit, appVersion.getChangelist());
    }

}