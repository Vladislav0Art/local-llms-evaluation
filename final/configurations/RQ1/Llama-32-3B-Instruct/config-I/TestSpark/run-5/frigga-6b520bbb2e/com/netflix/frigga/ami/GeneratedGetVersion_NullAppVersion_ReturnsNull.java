package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_NullAppVersion_ReturnsNull {

    @Test
    public void getVersion_NullAppVersion_ReturnsNull() {
        // given
        AppVersion appVersion = null;

        // when
        String returnedVersion = appVersion.getVersion();

        // then
        assertNull(returnedVersion);
    }
}

public class AppVersion {

    public static final Pattern PUBLIC_APP_VERSION_PATTERN = Pattern.compile("([a-zA-Z0-9]+)-\\d+\\.\\d+-\\w+");
    public static final Pattern APP_VERSION_PATTERN = Pattern.compile("([a-zA-Z0-9]+)-\\d+\\.\\d+-\\w+");

    private String packageName;
    private String version;

    public AppVersion(String packageName) {
        this.packageName = packageName;
    }

    public static Pattern getAppVersionPattern() {
        return PUBLIC_APP_VERSION_PATTERN;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getVersion() {
        return version;
    }

    public static AppVersion parseName(String amiName) {
        Matcher matcher = APP_VERSION_PATTERN.matcher(amiName);
        if (matcher.find()) {
            return new AppVersion(matcher.group(1));
        }
        return null;
    }

}