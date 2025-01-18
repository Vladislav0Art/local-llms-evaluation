package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsSameValuesTest {

    @Test
    public void equalsSameValuesTest() {
        AppVersion appVersion1 = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        AppVersion appVersion2 = AppVersion.parseName("appName-version-buildJob-buildNumber-commit");
        assertTrue(appVersion1.equals(appVersion2));
    }

}