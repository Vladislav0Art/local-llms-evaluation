package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetPackageName {

    public static class AppVersionTest {

        @Test
        public void testGetPackageName() {
            AppVersion appVersion = new AppVersion();
            String packageName = "ami-name-123";
            System.out.println(appVersion.getPackage());
        }

    }