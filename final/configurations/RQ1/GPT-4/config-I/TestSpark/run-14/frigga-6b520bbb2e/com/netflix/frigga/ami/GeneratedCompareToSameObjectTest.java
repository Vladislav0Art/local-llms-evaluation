package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToSameObjectTest {

    @Test
    public void compareToSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");
        assertEquals(0, appVersion.compareTo(appVersion));
    }

}