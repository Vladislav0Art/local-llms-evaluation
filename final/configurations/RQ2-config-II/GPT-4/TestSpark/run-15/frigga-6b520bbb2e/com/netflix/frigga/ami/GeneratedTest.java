package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");
        assertEquals("packageName", appVersion.getPackageName());
        assertEquals("version", appVersion.getVersion());
        assertEquals("buildJobName", appVersion.getBuildJobName());
        assertEquals("buildNum", appVersion.getBuildNumber());
        assertEquals("commit", appVersion.getCommit());
    }

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");
        AppVersion appVersion2 = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");

        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void compareToNotEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");
        AppVersion appVersion2 = AppVersion.parseName("packageName-version2-buildJobName-buildNum-commit");

        assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPatternTest() {
        assertTrue(AppVersion.getAppVersionPattern() instanceof Pattern);
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");

        assertEquals("commit", appVersion.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");

        assertEquals("packageName-version-buildJobName-buildNum-commit", appVersion.toString());
    }

    @Test
    public void equalsSelfTest() {
        AppVersion appVersion = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");

        assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");

        assertEquals(appVersion.hashCode(), appVersion.hashCode());
    }

}