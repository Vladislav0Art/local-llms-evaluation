package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_ReturnsBuildNumberTest {

    @Test
    public void getBuildNumber_ReturnsBuildNumberTest() {
        String buildNumber = "0";
        AppVersion appVersion = new AppVersion("0.9.2-0");
        assertEquals(buildNumber, appVersion.getBuildNumber());
    }

}