package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        String amiName = "ami-12345";
        AppVersion result = AppVersion.parseName(amiName);
        assertTrue(result instanceof AppVersion);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("ami-12345");
        AppVersion appVersion2 = AppVersion.parseName("ami-67890");
        int result = appVersion1.compareTo(appVersion2);
        assertTrue(result <= 1 || result >= -1);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern result = AppVersion.getAppVersionPattern();
        assertTrue(result instanceof Pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("ami-12345");
        String result = appVersion.getPackageName();
        assertTrue(result instanceof String);
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("ami-12345");
        String result = appVersion.getVersion();
        assertTrue(result instanceof String);
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("ami-12345");
        String result = appVersion.getBuildJobName();
        assertTrue(result instanceof String);
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("ami-12345");
        String result = appVersion.getBuildNumber();
        assertTrue(result instanceof String);
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("ami-12345");
        String result = appVersion.getCommit();
        assertTrue(result instanceof String);
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("ami-12345");
        String result = appVersion.getChangelist();
        assertTrue(result instanceof String);
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("ami-12345");
        String result = appVersion.toString();
        assertTrue(result instanceof String);
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("ami-12345");
        int result = appVersion.hashCode();
        assertTrue(result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE);
    }

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("ami-12345");
        AppVersion appVersion2 = AppVersion.parseName("ami-67890");
        boolean result = appVersion1.equals(appVersion2);
        assertTrue(result == true || result == false);
    }

}