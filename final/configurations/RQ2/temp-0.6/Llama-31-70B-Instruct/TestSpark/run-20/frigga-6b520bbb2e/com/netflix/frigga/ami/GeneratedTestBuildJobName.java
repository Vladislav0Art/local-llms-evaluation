package com.netflix.frigga.ami;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestBuildJobName {

    AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testBuildJobName() {
        String buildJobName = "buildJobName";
        appVersion.setBuildJobName(buildJobName);
        assertEquals(buildJobName, appVersion.getBuildJobName());
    }

}