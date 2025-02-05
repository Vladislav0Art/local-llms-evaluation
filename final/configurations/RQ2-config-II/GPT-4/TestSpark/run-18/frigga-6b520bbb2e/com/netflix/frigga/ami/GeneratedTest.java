package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidAmiNameTest() {
        String amiName = "validAmiName";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
    }

    @Test
    public void parseNameNullAmiNameTest() {
        String amiName = null;
        AppVersion result = AppVersion.parseName(amiName);
        assertNull(result);
    }

    @Test
    public void compareToEqualAppVersionsTest() {
        AppVersion version1 = AppVersion.parseName("testVersion");
        AppVersion version2 = AppVersion.parseName("testVersion");
        assertEquals(0, version1.compareTo(version2));
    }

    @Test
    public void compareToDifferentAppVersionsTest() {
        AppVersion version1 = AppVersion.parseName("testVersion1");
        AppVersion version2 = AppVersion.parseName("testVersion2");
        assertNotEquals(0, version1.compareTo(version2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageNameTest() {
        AppVersion version = AppVersion.parseName("testVersion");
        assertEquals("testVersion", version.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion version = AppVersion.parseName("testVersion");
        assertEquals("testVersion", version.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion version = AppVersion.parseName("testVersion");
        assertEquals("testVersion", version.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion version = AppVersion.parseName("testVersion");
        assertEquals("testVersion", version.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion version = AppVersion.parseName("testVersion");
        assertEquals("testVersion", version.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion version = AppVersion.parseName("testVersion");
        assertEquals("testVersion", version.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion version = AppVersion.parseName("testVersion");
        assertTrue(version.toString().contains("testVersion"));
    }

    @Test
    public void equalsSameInstanceTest() {
        AppVersion version = AppVersion.parseName("testVersion");
        assertTrue(version.equals(version));
    }

    @Test
    public void equalsDifferentInstancesSameVersionTest() {
        AppVersion version1 = AppVersion.parseName("testVersion");
        AppVersion version2 = AppVersion.parseName("testVersion");
        assertTrue(version1.equals(version2));
    }

    @Test
    public void equalsDifferentInstancesDifferentVersionsTest() {
        AppVersion version1 = AppVersion.parseName("testVersion1");
        AppVersion version2 = AppVersion.parseName("testVersion2");
        assertFalse(version1.equals(version2));
    }

    @Test
    public void hashCodeTest() {
        AppVersion version = AppVersion.parseName("testVersion");
        int hash = version.hashCode();
        assertTrue(hash != 0);
    }

}