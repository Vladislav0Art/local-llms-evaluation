package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetPackageName_GivenNullReturnsNull {

    @Test
    public void getPackageName_GivenNullReturnsNull() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getPackageName());
    }
}

public class AppVersion {

    private String packageName;
    private String version;
    private String buildJobName;
    private String buildNumber;
    private String commit;

    public static AppVersion parseName(String pattern) {
        // implementation
    }

    public int compareTo(AppVersion otherAppVersion) {
        // implementation
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuildJobName() {
        return buildJobName;
    }

    public void setBuildJobName(String buildJobName) {
        this.buildJobName = buildJobName;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getCommit() {
        return commit;
    }

    public static AppVersion parseNameFromMap(Map<String, Object> map) {
        // implementation
    }

}