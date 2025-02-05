package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCompareToNotEqualTest {

    @Test
    public void compareToNotEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");
        AppVersion appVersion2 = AppVersion.parseName("packageName-version2-buildJobName-buildNum-commit");

        assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

}