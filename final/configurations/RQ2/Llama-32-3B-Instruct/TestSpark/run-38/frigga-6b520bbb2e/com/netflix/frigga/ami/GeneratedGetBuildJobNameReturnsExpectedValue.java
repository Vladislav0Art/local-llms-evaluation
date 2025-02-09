package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobNameReturnsExpectedValue {

    @Test
    public void getBuildJobNameReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion("1.0.2-20220101", "build-job-name", "commit-hash");
        assertEquals("build-job-name", appVersion.getBuildJobName());
    }

}