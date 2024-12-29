package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidInputTest() {
        String amiName = "test-ami";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void parseNameNullInputTest() {
        String amiName = null;
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("test-ami");
        AppVersion appVersion2 = AppVersion.parseName("test-ami");
        int comparisonResult = appVersion1.compareTo(appVersion2);
        assertEquals(0, comparisonResult);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami");
        String packageName = appVersion.getPackageName();
        assertEquals("test", packageName);
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami");
        String version = appVersion.getVersion();
        assertEquals("ami", version);
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami");
        String buildJobName = appVersion.getBuildJobName();
        assertEquals("test", buildJobName);
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami");
        String buildNumber = appVersion.getBuildNumber();
        assertEquals("1", buildNumber);
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami");
        String commit = appVersion.getCommit();
        assertEquals("test", commit);
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami");
        String changelist = appVersion.getChangelist();
        assertEquals("test", changelist);
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami");
        String appString = appVersion.toString();
        assertNotNull(appString);
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami");
        int hashCode = appVersion.hashCode();
        assertNotNull(hashCode);
    }

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("test-ami");
        AppVersion appVersion2 = AppVersion.parseName("test-ami");
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equalsFalseTest() {
        AppVersion appVersion1 = AppVersion.parseName("test-ami");
        AppVersion appVersion2 = AppVersion.parseName("other-ami");
        assertFalse(appVersion1.equals(appVersion2));
    }

}