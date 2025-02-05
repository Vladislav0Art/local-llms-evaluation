package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-0.0.1");
        assertNotNull(appVersion);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("testApp1-0.0.1");
        AppVersion appVersion2 = AppVersion.parseName("testApp2-0.0.2");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-0.0.1");
        assertEquals("testApp", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-0.0.1");
        assertEquals("0.0.1", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-0.0.1-build1");
        assertEquals("build1", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-0.0.1-build-1");
        assertEquals("1", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-0.0.1-commit-1");
        assertEquals("1", appVersion.getCommit());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-0.0.1");
        assertEquals("testApp-0.0.1", appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-0.0.1");
        int expectedHashCode = appVersion.toString().hashCode();
        assertEquals(expectedHashCode, appVersion.hashCode());
    }

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("testApp-0.0.1");
        AppVersion appVersion2 = AppVersion.parseName("testApp-0.0.1");
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equalsWithNullTest() {
        AppVersion appVersion = AppVersion.parseName("testApp-0.0.1");
        assertFalse(appVersion.equals(null));
    }

}