package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseName_EmptyString {

    private AppVersion appVersion;

    @BeforeEach
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testParseName_EmptyString() {
        String amiName = "";
        try {
            AppVersion.parseName(amiName);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // expected
        }
    }

}