package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToEqualTest {

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("AppName-version-buildJob-buildNumber-commit");
        AppVersion appVersion2 = AppVersion.parseName("AppName-version-buildJob-buildNumber-commit");
        assertTrue(appVersion1.compareTo(appVersion2) == 0);
    }

}