package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_ReturnsCorrectBuildJobName {

    @Test
    public void getBuildJobName_ReturnsCorrectBuildJobName() {
        AppVersion appVersion = new AppVersion("ami-123");
        assertEquals("build-job-name", appVersion.getBuildJobName());
    }

}