package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestEquals_WithoutNestedProperties {

    private AppVersion appVersion;

    @BeforeEach
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testEquals_WithoutNestedProperties() {
        AppVersion other = new AppVersion();
        other.setChangelist("changelist", "value");
        assertEquals(appVersion, other);
    }

}