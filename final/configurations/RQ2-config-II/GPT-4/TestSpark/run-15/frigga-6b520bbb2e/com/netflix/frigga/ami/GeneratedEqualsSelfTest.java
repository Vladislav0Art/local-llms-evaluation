package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEqualsSelfTest {

    @Test
    public void equalsSelfTest() {
        AppVersion appVersion = AppVersion.parseName("packageName-version-buildJobName-buildNum-commit");

        assertTrue(appVersion.equals(appVersion));
    }

}