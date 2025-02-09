package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion version1 = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        AppVersion version2 = AppVersion.parseName("packageName-version2-buildJobName-2-commit2");
        assertNotEquals(0, version1.compareTo(version2));
    }

}