package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetBuildNumber_WithoutNestedProperties {

    private AppVersion appVersion;

    @BeforeEach
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetBuildNumber_WithoutNestedProperties() {
        appVersion = new AppVersion();
        assertEquals("jenkins build number=", appVersion.getBuildNumber());
    }

}