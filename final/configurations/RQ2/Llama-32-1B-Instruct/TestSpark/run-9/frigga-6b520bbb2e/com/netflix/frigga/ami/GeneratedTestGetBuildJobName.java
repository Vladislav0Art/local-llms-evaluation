package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTestGetBuildJobName {

    @Test
    public void testGetBuildJobName() {
        // Create a mock for AppVersion and get its build job name
        AppVersion appVersion = mock(AppVersion.class);
        String expectedBuildJobName = "build-job-name";
        when(appVersion.getBuildJobName()).thenReturn(expectedBuildJobName);
        assertEquals(expectedBuildJobName, appVersion.getBuildJobName());
    }

}