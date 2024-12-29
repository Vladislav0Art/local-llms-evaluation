package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetBuildJobName_ReturnsBuildJobName {

    @Test
    public void getBuildJobName_ReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion("build-job-name-1");
        assertEquals("build-job-name-1", appVersion.getBuildJobName());
    }

}