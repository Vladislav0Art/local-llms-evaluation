package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetBuildJobName_ValidAppVersion_ReturnsBuildJobName {

    @Test
    public void getBuildJobName_ValidAppVersion_ReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion();
        appVersion.buildJobName = "job-123";
        assertEquals("job-123", appVersion.getBuildJobName());
    }

}