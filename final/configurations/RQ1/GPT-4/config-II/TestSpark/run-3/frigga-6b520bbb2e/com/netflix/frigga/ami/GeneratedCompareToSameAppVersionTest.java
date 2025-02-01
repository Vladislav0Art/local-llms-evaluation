package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToSameAppVersionTest {

    @Test
    public void compareToSameAppVersionTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals(0, appVersion.compareTo(appVersion));
    }

}