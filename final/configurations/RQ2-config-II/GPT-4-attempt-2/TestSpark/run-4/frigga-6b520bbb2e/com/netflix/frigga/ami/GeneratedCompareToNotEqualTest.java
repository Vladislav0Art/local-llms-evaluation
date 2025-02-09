package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToNotEqualTest {

    @Test
    public void compareToNotEqualTest() {
        AppVersion appVersion1 = AppVersion.parseName("ami-App1-v1.0");
        AppVersion appVersion2 = AppVersion.parseName("ami-App2-v2.0");
        assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

}