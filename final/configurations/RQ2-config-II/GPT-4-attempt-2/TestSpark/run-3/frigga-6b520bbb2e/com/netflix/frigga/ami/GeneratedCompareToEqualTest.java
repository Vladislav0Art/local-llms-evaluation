package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedCompareToEqualTest {

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("testpackage-testversion-h0test.build");
        AppVersion appVersion2 = AppVersion.parseName("testpackage-testversion-h0test.build");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}