package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        assertNull(AppVersion.parseName(""));
    }

    @Test
    public void parseName_SingleWord_ReturnsAppVersionInstance() {
        AppVersion appVersion = AppVersion.parseName("myapp");
        assertEquals("myapp", appVersion.getVersion());
    }

    @Test
    public void parseName_MultipleWords_ReturnsCorrectlyParsedAppVersion() {
        AppVersion appVersion = AppVersion.parseName("aws-app-1234-1234-1234-12345");
        assertTrue(appVersion.getPackageName().equals("aws-app"));
    }

    @Test
    public void getAppVersionPattern_ReturnsCorrectPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("aws-app-1234-1234-1234-12345").find());
    }

    @Test
    public void getPackageName_EmptyString_ReturnsEmptyString() {
        assertEquals("", AppVersion.parseName("").getPackageName());
    }

    @Test
    public void getPackageName_SingleWord_ReturnsCorrectlyParsedPackage() {
        String package_ = "aws-app";
        AppVersion appVersion = AppVersion.parseName(package_);
        assertEquals(package_, appVersion.getPackageName());
    }

    @Test
    public void getVersion_EmptyString_ReturnsEmptyString() {
        assertEquals("", AppVersion.parseName("").getVersion());
    }

    @Test
    public void getVersion_SingleWord_ReturnsCorrectlyParsedVersion() {
        String version = "1234";
        AppVersion appVersion = AppVersion.parseName("aws-app-" + version);
        assertEquals(version, appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_EmptyString_ReturnsEmptyString() {
        assertEquals("", AppVersion.parseName("").getBuildJobName());
    }

    @Test
    public void getBuildNumber_EmptyString_ReturnsEmptyString() {
        assertEquals("", AppVersion.parseName("").getBuildNumber());
    }

    @Test
    public void getCommit_EmptyString_ReturnsEmptyString() {
        assertEquals("", AppVersion.parseName("").getCommit());
    }

    @Test
    public void getChangelist_Dehprecated_ReturnsEmptyString() {
        @Deprecated String changelist = AppVersion.parseName("").getChangelist();
        assertEquals(changelist, "");
    }

}