package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetBuildJobName_ValidAppVersion_ReturnsExpectedBuildJobName {

    @Test
    public void getBuildJobName_ValidAppVersion_ReturnsExpectedBuildJobName() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        String buildJobName = appVersion.getBuildJobName();
        assertEquals("build-job-name", buildJobName);
    }

}