package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_ValidInput_ReturnsBuildNumber {

    @Test
    public void getBuildNumber_ValidInput_ReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String buildNumber = appVersion.getBuildNumber();
        assertEquals("1", buildNumber);
    }

}