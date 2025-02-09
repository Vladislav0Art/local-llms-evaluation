package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void parseName_ExistingAppVersionTest() {
        String amiName = "1.0.2-20180808T1439Z";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void parseName_NullInput

    Test() {
        String amiName = null;
        try {
            AppVersion.parseName(amiName);
            assertTrue(false);
        } catch (Exception e) {
        }
    }

    @Test
    public void parseName_InvalidFormatTest() {
        String amiName = " invalid format";
        try {
            AppVersion.parseName(amiName);
            assertTrue(false);
        } catch (Exception e) {
        }
    }

    @Test
    public void compareTo_LowestVersionFirstTest() {
        AppVersion version1 = new AppVersion("1.0.2-20180808T1439Z");
        AppVersion version2 = new AppVersion("1.0.3-20180808T1439Z");
        assertEquals(-1, version1.compareTo(version2));
    }

    @Test
    public void compareTo_LowestVersionFirstEmptyTest() {
        AppVersion version1 = new AppVersion("1.0.2-20180808T1439Z");
        AppVersion version2 = null;
        assertEquals(-1, version1.compareTo(version2));
    }

    @Test
    public void getAppVersionPattern_CorrectPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
        assertTrue(pattern.matcher("1.0.2-20180808T1439Z").matches());
    }

    @Test
    public void getPackageName_AmiPackageTest() {
        AppVersion appVersion = new AppVersion("1.0.2-20180808T1439Z");
        assertEquals(NameConstants.AMI_PACKAGE, appVersion.getPackageName());
    }

    @Test
    public void getVersion_HumanReadableVersionTest() {
        AppVersion appVersion = new AppVersion("1.0.2-20180808T1439Z");
        assertNotNull(appVersion.getVersion());
        assertTrue(appVersion.getVersion().matches("[0-9]+\\.[0-9]+\\.[0-9]+$"));
    }

    @Test
    public void getBuildJobName_NoBuildJobNameTest() {
        AppVersion appVersion = new AppVersion("1.0.2-20180808T1439Z");
        assertEquals("", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumber_BuildNumberPresentTest() {
        AppVersion appVersion = new AppVersion("1.0.2-20180808T1439Z");
        assertNotNull(appVersion.getBuildNumber());
        assertTrue(appVersion.getBuildNumber().matches("[0-9]+"));
    }

    @Test
    public void getCommit_HasNoCommitTagTest() {
        AppVersion appVersion = new AppVersion("1.0.2-20180808T1439Z");
        assertEquals("", appVersion.getCommit());
    }

    @Test
    public void getChangelist_DeprecatedMethodTest() {
        @Deprecated
        String changelist = AppVersion.class.getDeclaredMethod("getChangelist").invoke(null);
        assertNotNull(changelist);
    }

    @Test
    public void toString_AmiStringRepresentationTest() {
        AppVersion appVersion = new AppVersion("1.0.2-20180808T1439Z");
        assertNotNull(appVersion.toString());
    }

    @Test
    public void hashCode_CorrectHashCodeTest() {
        AppVersion appVersion = new AppVersion("1.0.2-20180808T1439Z");
        int hashcode = appVersion.hashCode();
        assertNotNull(hashcode);
    }

    @Test
    public void equals_SameAppVersionEqualsTest() {
        AppVersion appVersion = new AppVersion("1.0.2-20180808T1439Z");
        assertTrue(appVersion.equals(appVersion));
    }

}