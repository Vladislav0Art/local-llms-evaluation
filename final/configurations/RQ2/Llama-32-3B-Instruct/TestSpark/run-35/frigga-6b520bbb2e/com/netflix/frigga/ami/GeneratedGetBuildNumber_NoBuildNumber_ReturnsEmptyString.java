package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedGetBuildNumber_NoBuildNumber_ReturnsEmptyString {

    @Test
    public void getBuildNumber_NoBuildNumber_ReturnsEmptyString() {
        AppVersion appVersion = new AppVersion("my-package", "my-version");
        assertEquals("", appVersion.getBuildNumber());
    }

}