package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_ReturnsExpectedBuildJobName Test {

    @Test
    public void getBuildJobName_ReturnsExpectedBuildJobName

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        assertEquals("build-job-123456789", appVersion.getBuildJobName());
    }

}