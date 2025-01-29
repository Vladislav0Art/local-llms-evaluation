package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestPrintAppVersion {

    public static class AppVersionTest {

        @Test
        public void testPrintAppVersion() {
            AppVersion appVersion = new AppVersion();
            String packageName = "ami-name-123";
            System.out.println(appVersion.getName());
        }
    }

    public static class AppVersion {
        public String getName() {
            return name;
        }

        public String getPackageName() {
            return package_name;
        }

        public void setPackage(String packageName) {
            this.package_name = packageName;
        }
    }

}