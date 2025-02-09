package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToEqualTest {

    @Test
    public void compareToEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("testName");
        AppVersion appVersion2 = AppVersion.parseName("testName", );
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}