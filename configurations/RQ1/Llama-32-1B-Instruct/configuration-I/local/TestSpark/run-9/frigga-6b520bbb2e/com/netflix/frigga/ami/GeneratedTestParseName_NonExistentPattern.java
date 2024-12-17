package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseName_NonExistentPattern {

    private AppVersion appVersion;

    @BeforeEach
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testParseName_NonExistentPattern() {
        String amiName = "subscriberha-1.0.0-586499-123456";
        appVersion = AppVersion.parseName(amiName);
        fail("Expected exception not thrown");
    }

}