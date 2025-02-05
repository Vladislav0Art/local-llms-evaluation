package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseNameNullInputTest() {
        assertNull(AppVersion.parseName(null));
    }

    @Test
    public void parseNameEmptyInputTest() {
        assertNull(AppVersion.parseName(""));
    }

    @Test
    public void parseNameValidInputTest() {
        assertNotNull(AppVersion.parseName("app-1.0.0-h0.78cf3b2"));
    }

    @Test
    public void compareToNullTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertEquals(1, version.compareTo(null));
    }

    @Test
    public void compareToEqualToTest() {
        AppVersion version1 = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        AppVersion version2 = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertEquals(0, version1.compareTo(version2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
        assertTrue(pattern.matcher("app-1.0.0-h0.78cf3b2").matches());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertNotNull(version.getPackageName());
        assertEquals("app", version.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertNotNull(version.getVersion());
        assertEquals("1.0.0", version.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertNotNull(version.getBuildJobName());
        assertEquals("h0", version.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertNotNull(version.getBuildNumber());
        assertEquals("0", version.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertNotNull(version.getCommit());
        assertEquals("78cf3b2", version.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertNotNull(version.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertNotNull(version.toString());
        assertEquals("app-1.0.0-h0.78cf3b2", version.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertEquals(AppVersion.parseName("app-1.0.0-h0.78cf3b2").hashCode(), version.hashCode());
    }

    @Test
    public void equalsNullTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertFalse(version.equals(null));
    }

    @Test
    public void equalsSameObjectTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertTrue(version.equals(version));
    }

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion version1 = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        AppVersion version2 = AppVersion.parseName("app-2.0.0-h0.89df4c3");
        assertFalse(version1.equals(version2));
    }

}