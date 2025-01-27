package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_ReturnsExpectedBuildNumber Test {

    @Test
    public void getBuildNumber_ReturnsExpectedBuildNumber

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        assertEquals("123456789", appVersion.getBuildNumber());
    }

}