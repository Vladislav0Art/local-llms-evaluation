package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedTest {

    @Test
    public void parseNameValidInputTest() {
        AppVersion version = AppVersion.parseName("packageName-version-buildJobName-buildNumber-commit");
        assertEquals("packageName", version.getPackageName());
        assertEquals("version", version.getVersion());
        assertEquals("buildJobName", version.getBuildJobName());
        assertEquals("buildNumber", version.getBuildNumber());
        assertEquals("commit", version.getCommit());
    }

    @Test
    public void parseNameInvalidInputTest() {
        AppVersion.parseName("Invalid Input");
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotEquals(null, AppVersion.getAppVersionPattern());
    }

    @Test
    public void compareToTest() {
        AppVersion version1 = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        AppVersion version2 = AppVersion.parseName("packageName-version2-buildJobName-2-commit2");
        assertNotEquals(0, version1.compareTo(version2));
    }

    @Test
    public void toStringTest() {
        AppVersion version = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        assertEquals("packageName-version-buildJobName-1-commit", version.toString());
    }

    @Test
    public void equalsTest() {
        AppVersion version1 = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        AppVersion version2 = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        AppVersion version3 = AppVersion.parseName("packageName-version-buildJobName-1-commit2");
        assertEquals(version1, version2);
        assertNotEquals(version1, version3);
    }

    @Test
    public void hashCodeTest() {
        AppVersion version1 = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        AppVersion version2 = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        assertNotEquals(version1.hashCode(), version2.hashCode());
    }

    @Test
    public void getChangelistTest() {
        AppVersion version = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        assertEquals(null, version.getChangelist());
    }

}