package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameNotNullTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        assertNotNull(appVersion);
    }

    @Test
    public void compareToWhenOtherIsNullTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        int result = appVersion.compareTo(null);
        assertEquals(1, result);
    }

    @Test
    public void compareToWhenOtherIsNotNullTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        AppVersion other = AppVersion.parseName("other");
        int result = appVersion.compareTo(other);
        assertTrue(result == 0 || result == -1);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        String packageName = appVersion.getPackageName();
        assertNotNull(packageName);
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        String version = appVersion.getVersion();
        assertNotNull(version);
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        String buildJobName = appVersion.getBuildJobName();
        assertNotNull(buildJobName);
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        String buildNumber = appVersion.getBuildNumber();
        assertNotNull(buildNumber);
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        String commit = appVersion.getCommit();
        assertNotNull(commit);
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        String changelist = appVersion.getChangelist();
        assertNotNull(changelist);
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        String appVersionString = appVersion.toString();
        assertNotNull(appVersionString);
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        int hashCode = appVersion.hashCode();
        assertNotNull(Integer.valueOf(hashCode));
    }

    @Test
    public void equalsWhenOtherIsNullTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        boolean isEqual = appVersion.equals(null);
        assertFalse(isEqual);
    }

    @Test
    public void equalsWhenOtherIsNotNullTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        AppVersion other = AppVersion.parseName("other");
        boolean isEqual = appVersion.equals(other);
        assertFalse(isEqual);
    }

}