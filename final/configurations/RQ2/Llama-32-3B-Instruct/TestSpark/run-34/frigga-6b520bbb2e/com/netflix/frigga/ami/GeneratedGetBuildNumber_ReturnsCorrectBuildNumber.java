package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_ReturnsCorrectBuildNumber {

    @Test
    public void getBuildNumber_ReturnsCorrectBuildNumber() {
        AppVersion appVersion = new AppVersion("ami-123");
        assertEquals("build-number", appVersion.getBuildNumber());
    }

}