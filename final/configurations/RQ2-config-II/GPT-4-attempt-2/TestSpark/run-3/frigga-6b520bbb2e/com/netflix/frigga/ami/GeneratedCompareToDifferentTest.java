package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedCompareToDifferentTest {

    @Test
    public void compareToDifferentTest() {
        AppVersion appVersion1 = AppVersion.parseName("testpackage1-testversion-h0test.build");
        AppVersion appVersion2 = AppVersion.parseName("testpackage2-testversion-h0test.build");
        assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

}