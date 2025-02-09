package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_ValidCommit_ReturnsExpectedBuildNumber {

    @Test
    public void getBuildNumber_ValidCommit_ReturnsExpectedBuildNumber() {
        AppVersion appVersion = new AppVersion("0.9.1-EC2-X86_64-GP2");
        String expectedBuildNumber = "1";
        assertEquals(expectedBuildNumber, appVersion.getBuildNumber());
    }

}