package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_EmptyString_ReturnsEmptyString {

    @Test
    public void getBuildNumber_EmptyString_ReturnsEmptyString() {
        String buildNumber = AppVersion.getBuildNumber("");
        assertEquals("", buildNumber);
    }

}