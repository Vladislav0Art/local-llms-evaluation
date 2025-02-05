package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCompareToEqualTest {

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");
        AppVersion appVersion2 = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");

        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}