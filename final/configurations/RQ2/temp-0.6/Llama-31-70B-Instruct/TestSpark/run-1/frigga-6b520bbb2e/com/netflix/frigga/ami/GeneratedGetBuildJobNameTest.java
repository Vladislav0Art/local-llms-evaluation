package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetBuildJobNameTest {

    private AppVersion appVersion;

    @Test
    public void getBuildJobNameTest() {
        String expectedBuildJobName = "build-job-name";

        String actualBuildJobName = appVersion.getBuildJobName();

        assertEquals(expectedBuildJobName, actualBuildJobName);
    }

}