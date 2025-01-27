package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_ValidBuildJobName {

    @Test
    public void getBuildJobName_ValidBuildJobName() {
        String buildJobName = "build-job-1234567890";
        AppVersion appVersion = new AppVersion("ami-123456789012345678901234567890", buildJobName, "1.2.3");
        assertEquals(buildJobName, appVersion.getBuildJobName());
    }

}