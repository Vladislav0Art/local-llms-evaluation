package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidNameTest() {
        AppVersion appVersion = AppVersion.parseName("validName");
        assertNotNull(appVersion);
    }

    @Test
    public void parseNameNullNameTest() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

    @Test
    public void compareToEqualObjectsTest() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setVersion("1.0.0");
        AppVersion appVersion2 = new AppVersion();
        appVersion2.setVersion("1.0.0");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareToDifferentObjectsTest() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setVersion("1.0.0");
        AppVersion appVersion2 = new AppVersion();
        appVersion2.setVersion("2.0.0");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("packageName");
        assertEquals("packageName", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("1.0.0");
        assertEquals("1.0.0", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName("buildJobName");
        assertEquals("buildJobName", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber("100");
        assertEquals("100", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = new AppVersion();
        appVersion.setCommit("commit");
        assertEquals("commit", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = new AppVersion();
        appVersion.setChangelist("changelist");
        assertEquals("changelist", appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.hashCode());
    }

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = appVersion1;
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void equalsNullObjectTest() {
        AppVersion appVersion = new AppVersion();
        assertFalse(appVersion.equals(null));
    }

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        appVersion2.setVersion("2.0.0");
        assertFalse(appVersion1.equals(appVersion2));
    }

}