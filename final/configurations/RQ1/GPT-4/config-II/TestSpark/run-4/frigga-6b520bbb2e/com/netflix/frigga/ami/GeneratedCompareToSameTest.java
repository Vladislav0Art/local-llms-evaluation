package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToSameTest {

    @Test
    public void compareToSameTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");

        assertEquals(0, appVersion.compareTo(appVersion));
    }

}