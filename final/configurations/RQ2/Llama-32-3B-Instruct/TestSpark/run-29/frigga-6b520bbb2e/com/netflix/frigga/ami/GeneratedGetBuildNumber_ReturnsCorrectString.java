package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedGetBuildNumber_ReturnsCorrectString {

    @Test
    public void getBuildNumber_ReturnsCorrectString() {
        String buildNumber = "456";
        AppVersion appVersion = new AppVersion();
        assertEquals(buildNumber, appVersion.getBuildNumber());
    }

}