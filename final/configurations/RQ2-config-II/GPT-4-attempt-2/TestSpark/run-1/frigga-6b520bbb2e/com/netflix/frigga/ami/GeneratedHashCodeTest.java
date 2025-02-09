package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion version1 = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        AppVersion version2 = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        assertNotEquals(version1.hashCode(), version2.hashCode());
    }

}