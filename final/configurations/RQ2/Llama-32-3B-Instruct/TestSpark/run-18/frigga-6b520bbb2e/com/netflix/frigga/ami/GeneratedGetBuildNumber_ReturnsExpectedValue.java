package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedGetBuildNumber_ReturnsExpectedValue {

    @Test
    public void getBuildNumber_ReturnsExpectedValue() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String buildNumber = appVersion.getBuildNumber();
        assertEquals("2", buildNumber);
    }

}