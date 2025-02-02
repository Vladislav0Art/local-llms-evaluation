package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_ValidString_ReturnsParsedAppVersion() {
        // given
        String amiName = "subscriberha-1.0.0-586499";
        Pattern pattern = AppVersion.PUBLIC_APP_VERSION_PATTERN;

        // when
        AppVersion parsedName = AppVersion.parseName(amiName);

        // then
        assertNotNull(parsedName);
    }

    @Test
    public void parseName_InvalidString_ReturnsNull() {
        // given
        String amiName = "invalid";

        // when
        AppVersion parsedName = AppVersion.parseName(amiName);

        // then
        assertNull(parsedName);
    }

    @Test
    public void parseName_NullString_ReturnsNull() {
        // given
        String amiName = null;

        // when
        AppVersion parsedName = AppVersion.parseName(amiName);

        // then
        assertNull(parsedName);
    }

    @Test
    public void getAppVersionPattern_ReturnsPattern() {
        // given
        Pattern pattern = AppVersion.PUBLIC_APP_VERSION_PATTERN;

        // when
        Pattern returnedPattern = AppVersion.getAppVersionPattern();

        // then
        assertEquals(pattern, returnedPattern);
    }

    @Test
    public void getPackageName_ValidAppVersion_ReturnsPackageName() {
        // given
        String packageName = "subscriberha";
        AppVersion appVersion = new AppVersion(packageName);

        // when
        String returnedPackageName = appVersion.getPackageName();

        // then
        assertEquals(packageName, returnedPackageName);
    }

    @Test
    public void getPackageName_NullAppVersion_ReturnsNull() {
        // given
        AppVersion appVersion = null;

        // when
        String returnedPackageName = appVersion.getPackageName();

        // then
        assertNull(returnedPackageName);
    }

    @Test
    public void getVersion_ValidAppVersion_ReturnsVersion() {
        // given
        String version = "1.0.0";
        AppVersion appVersion = new AppVersion(version);

        // when
        String returnedVersion = appVersion.getVersion();

        // then
        assertEquals(version, returnedVersion);
    }

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