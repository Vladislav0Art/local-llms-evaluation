package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToNotEqualTest {

    @Test
    public void compareToNotEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("testName1");
        AppVersion appVersion2 = AppVersion.parseName("testName2");
        assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

}