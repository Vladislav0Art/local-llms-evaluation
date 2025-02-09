package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion version1 = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        AppVersion version2 = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        AppVersion version3 = AppVersion.parseName("packageName-version-buildJobName-1-commit2");
        assertEquals(version1, version2);
        assertNotEquals(version1, version3);
    }

}