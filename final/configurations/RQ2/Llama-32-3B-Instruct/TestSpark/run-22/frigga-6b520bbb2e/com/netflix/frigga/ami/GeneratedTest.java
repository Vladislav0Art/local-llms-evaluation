package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_WithoutPattern_ReturnsNull() {
        String amiName = "test";
        Pattern pattern = AppVersion.getAppVersionPattern();
        assert pattern != null;
        Matcher matcher = pattern.matcher(amiName);
        matcher.find();
        assertThat(AppVersion.parseName(amiName), is(null));
    }

    @Test
    public void parseName_WithPattern_ReturnsParsedAppVersion() {
        String amiName = "test";
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher(amiName);
        matcher.find();
        AppVersion expected = new AppVersion("test");
        assertThat(AppVersion.parseName(amiName), is(expected));
    }

    @Test
    public void compareVersions_EmptyString_ReturnsZero() {
        String version1 = "test";
        String version2 = "";
        int result = AppVersion.parseName(version1).compareTo(AppVersion.parseName(version2));
        assertThat(result, is(0));
    }

    @Test
    public void compareVersions_NonNumericCharacter_ReturnsNegativeInt() {
        String version1 = "test";
        String version2 = "te-st";
        int result = AppVersion.parseName(version1).compareTo(AppVersion.parseName(version2));
        assertThat(result, is(-1));
    }

    @Test
    public void compareVersions_NumericVersionsAreGreater_ReturnsPositiveInt() {
        String version1 = "10.20.30";
        String version2 = "9.20.30";
        int result = AppVersion.parseName(version1).compareTo(AppVersion.parseName(version2));
        assertThat(result, is(1));
    }

    @Test
    public void getPackageName_EmptyString_ReturnsEmptyString() {
        String packageName = "";
        String version = "test";
        AppVersion appVersion = new AppVersion(version);
        String result = appVersion.getPackageName();
        assertThat(result, is(""));
    }

    @Test
    public void getPackageName_NonEmptyString_ReturnsPackageName() {
        String packageName = "test";
        String version = "test";
        AppVersion appVersion = new AppVersion(version);
        String result = appVersion.getPackageName();
        assertThat(result, is(packageName));
    }

    @Test
    public void getVersion_EmptyString_ReturnsEmptyString() {
        String version = "";
        AppVersion appVersion = new AppVersion(version);
        String result = appVersion.getVersion();
        assertThat(result, is(""));
    }

    @Test
    public void getVersion_NonEmptyString_ReturnsVersion() {
        String version = "test";
        AppVersion appVersion = new AppVersion(version);
        String result = appVersion.getVersion();
        assertThat(result, is(version));
    }

}