package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestToString_WithoutNestedProperties {

    private AppVersion appVersion;

    @BeforeEach
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testToString_WithoutNestedProperties() {
        appVersion = new AppVersion();
        assertEquals("AppVersion [packageName=subscriberha-1.0.0-586499, version=changelist=value, buildJobName=jenkins job=changelist=value, buildNumber=jenkins commit=changelist=value]", appVersion.toString());
    }

}