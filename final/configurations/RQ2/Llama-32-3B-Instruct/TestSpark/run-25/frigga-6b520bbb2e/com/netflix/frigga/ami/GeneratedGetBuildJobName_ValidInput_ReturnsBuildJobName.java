package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_ValidInput_ReturnsBuildJobName {

    @Test
    public void getBuildJobName_ValidInput_ReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String buildJobName = appVersion.getBuildJobName();
        assertEquals("build-number", buildJobName);
    }

}