package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestParseName {

    public static class AppVersionTest {

        @Test
        public void testParseName() {
            AppVersion appVersion = new AppVersion();
            String name = "ami-name-123";
            Matcher matcher = PatternParser.parseName(name);
            assertEquals("ami-name", matcher.group(1));
            assertEquals("123", matcher.group(2));

            Matcher matcherBuildNumber = PatternParser.parseBuildNumber("build-number-456");
            assertEquals("build-number", matcherBuildNumber.group(1));
            assertEquals("456", matcherBuildNumber.group(2));
        }

    }