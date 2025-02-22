package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedTestGetBuildJobName {

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        String buildJobName = "testJob";
        appVersion.buildJobName = buildJobName;
        String resultBuildJobName = appVersion.getBuildJobName();
        assertEquals(buildJobName, resultBuildJobName);
    }

}