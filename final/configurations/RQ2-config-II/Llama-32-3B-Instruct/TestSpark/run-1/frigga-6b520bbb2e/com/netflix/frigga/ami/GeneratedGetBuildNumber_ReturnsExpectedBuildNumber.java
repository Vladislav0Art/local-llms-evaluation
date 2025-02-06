package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_ReturnsExpectedBuildNumber {

    @Test
    public void getBuildNumber_ReturnsExpectedBuildNumber() {
        String buildNumber = "1234567890";
        assertEquals(buildNumber, AppVersion.parseName("ami-1234567890").getBuildNumber());
    }

}