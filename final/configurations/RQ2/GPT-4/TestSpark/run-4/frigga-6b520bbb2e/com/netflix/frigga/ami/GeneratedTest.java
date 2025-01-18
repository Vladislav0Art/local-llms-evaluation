package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameValidNameTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        assertNotNull(appVersion);
    }

    @Test
    public void parseNameNullNameTest() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

    @Test
    public void compareToEqualAppVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        AppVersion appVersion2 = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareToDifferentAppVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        AppVersion appVersion2 = AppVersion.parseName("com.netflix.server-1.1-h12.170042ebd");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        assertEquals("com.netflix.server", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        assertEquals("1.0", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        assertEquals("Job", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        assertEquals("12", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        assertEquals("170042ebd", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        appVersion.getChangelist();
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        assertEquals("com.netflix.server-1.0-h12.170042ebd", appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        assertEquals(appVersion.hashCode(), appVersion.hashCode());
    }

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void equalsNullObjectTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        assertFalse(appVersion.equals(null));
    }

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion appVersion1 = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        AppVersion appVersion2 = AppVersion.parseName("com.netflix.server-1.1-h12.170042ebd");
        assertFalse(appVersion1.equals(appVersion2));
    }

}