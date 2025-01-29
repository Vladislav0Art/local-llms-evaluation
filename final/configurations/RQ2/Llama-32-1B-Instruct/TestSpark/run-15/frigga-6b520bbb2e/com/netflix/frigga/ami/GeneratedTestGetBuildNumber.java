package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetBuildNumber {

    public static void main(String[] args) {
        AppVersion test1 = new AppVersion();
        AppVersion test2 = new AppVersion();

        test1.setName("ami-name-123");
        test2.setName("ami-name-456");

        System.out.println(test1.getName());
        System.out.println(test2.getName());

        Pattern pattern = AppVersionAppVersionPattern();
        Matcher matcher = pattern.matcher(test1.getPackageName());

        if (matcher.matches()) {
            System.out.println("Name matches pattern: " + matcher.group(0));
        } else {
            System.out.println("Name does not match pattern");
        }

        test2.setBuildNumber("build-number-789");

        System.out.println("Get build job name: " + test1.getBuildJobName());
        System.out.println("Get build number: " + test2.getBuildNumber());

    }

    public static AppVersion parseName(String amiName) {
        return new AppVersion() {
            @Override
            public int compareTo(AppVersion other) { // not used in this case

                return 0;

            }
        };
    }

    public static Pattern getAppVersionPattern() {
        return Pattern.compile("^[a-zA-Z0-9]+-([a-zA-Z0-9]+)$");
    }

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber("build-number-123");

        Matcher matcher = Pattern.compile("^\\d+$").matcher(appVersion.getBuildNumber());
        if (matcher.matches()) {
            System.out.println("Build number matches pattern: " + matcher.group(0));
        } else {
            System.out.println("Build number does not match pattern");
        }
    }

}