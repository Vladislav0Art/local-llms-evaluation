package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetPackageName_WithoutNestedProperties {

    private AppVersion appVersion;

    @BeforeEach
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetPackageName_WithoutNestedProperties() {
        appVersion = new AppVersion();
        assertEquals("subscriberha-1.0.0-586499", appVersion.getPackageName());
    }

}