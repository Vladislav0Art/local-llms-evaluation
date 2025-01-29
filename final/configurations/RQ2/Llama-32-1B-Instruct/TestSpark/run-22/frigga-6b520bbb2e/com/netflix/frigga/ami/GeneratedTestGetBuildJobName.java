package com.netflix.frigga.ami;

import org.junit.Test;

public class GeneratedTestGetBuildJobName {

    @Test
    public void testGetBuildJobName() {
        AppVersion.buildJobName = "build-job-name";
        assertEquals("build-job-name", AppVersion.getBuildJobName());
    }

}