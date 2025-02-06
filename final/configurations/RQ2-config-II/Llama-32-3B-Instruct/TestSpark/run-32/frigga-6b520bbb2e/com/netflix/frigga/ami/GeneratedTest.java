package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_ValidAmaridReturnCorrectInstance() {
        String amiName = "ami-1234";
        AppVersion result = AppVersion.parseName(amiName);
        assertNotNull(result);
        assertEquals("ami-1234", result.toString());
    }

    @Test
    public void parseName_InvalidAmaridThrowException() {
        String amiName = "invalid-amid";
        assertThrows(Exception.class, () -> AppVersion.parseName(amiName));
    }

    @Test
    public void compareTo_DifferentVersionsReturnCorrectOrder() {
        AppVersion version1 = new AppVersion("ami-1234", 12, 34);
        AppVersion version2 = new AppVersion("ami-5678", 23, 45);
        assertTrue(version1.compareTo(version2) < 0);
    }

    @Test
    public void compareTo_SameVersionsReturnZero() {
        AppVersion version1 = new AppVersion("ami-1234", 12, 34);
        AppVersion version2 = new AppVersion("ami-1234", 12, 34);
        assertEquals(0, version1.compareTo(version2));
    }

    @Test
    public void getAppVersionPattern_ReturnsCorrectPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("ami-[A-Za-z0-9]+").matches());
    }

    @Test
    public void getPackageName_ValidVersionReturnCorrectPackage() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertEquals(NameConstants.FRIGGA_AMI package,version.getPackageName());
    }

    @Test
    public void getPackageName_InvalidVersionThrowException() {
        AppVersion version = new AppVersion("invalid-ami", 12, 34);
        assertThrows(Exception.class, () -> version.getPackageName());
    }

    @Test
    public void getVersion_ValidVersionReturnCorrectVersion() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertEquals(34, Integer.parseInt(version.getVersion()));
    }

    @Test
    public void getBuildJobName_ValidVersionReturnCorrectBuildJobName() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertEquals("build-1234", version.getBuildJobName());
    }

    @Test
    public void getBuildNumber_ValidVersionReturnCorrectBuildNumber() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertEquals(34L, Long.parseLong(version.getBuildNumber()));
    }

    @Test
    public void getCommit_ValidVersionReturnCorrectCommit() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertEquals("commit-1234", version.getCommit());
    }

    @Test
    public void getChangelist_ThrowsException() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertThrows(UnsupportedOperationException.class, () -> version.getChangelist());
    }

    @Test
    public void toString_ValidVersionReturnCorrectStringRepresentation() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertEquals("ami-1234 (12,34)", version.toString());
    }

    @Test
    public void hashCode_ReturnsCorrectHashcode() {
        AppVersion version1 = new AppVersion("ami-1234", 12, 34);
        AppVersion version2 = new AppVersion("ami-5678", 23, 45);
        assertNotEquals(version1.hashCode(), version2.hashCode());
    }

    @Test
    public void equals_DifferentVersionsReturnFalse() {
        AppVersion version1 = new AppVersion("ami-1234", 12, 34);
        AppVersion version2 = new AppVersion("ami-5678", 23, 45);
        assertFalse(version1.equals(version2));
    }

    @Test
    public void equals_SameVersionsReturnTrue() {
        AppVersion version1 = new AppVersion("ami-1234", 12, 34);
        AppVersion version2 = new AppVersion("ami-1234", 12, 34);
        assertTrue(version1.equals(version2));
    }

}