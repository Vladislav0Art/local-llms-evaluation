package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_ValidBuildNumber {

    @Test
    public void getBuildNumber_ValidBuildNumber() {
        String buildNumber = "12345";
        AppVersion appVersion = new AppVersion("ami-123456789012345678901234567890", "", buildNumber);
        assertEquals(buildNumber, appVersion.getBuildNumber());
    }

}