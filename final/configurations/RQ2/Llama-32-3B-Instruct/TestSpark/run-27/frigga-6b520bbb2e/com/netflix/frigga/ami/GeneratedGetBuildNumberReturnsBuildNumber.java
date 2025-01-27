package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumberReturnsBuildNumber {

    @Test
    public void getBuildNumberReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion("1.2.3-ami-amzn2");
        assertEquals("1.2.3", appVersion.getBuildNumber());
    }
}

class AppVersion {

    private String name;

    public AppVersion(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return name.split("-")[0];
    }

    public String getVersion() {
        return name.split("-")[1].split("\\.")[0];
    }

    public String getBuildJobName() {
        return name.split("-")[2];
    }

    public Object getCommit() {
        return "commitHash";
    }

    public static Pattern getAppVersionPattern() {
        return Pattern.compile("^\\d+\\.\\d+-[^-]+-[^ ]+$");
    }

}