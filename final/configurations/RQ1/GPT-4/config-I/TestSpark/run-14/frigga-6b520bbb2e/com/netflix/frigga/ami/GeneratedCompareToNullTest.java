package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToNullTest {

    @Test
    public void compareToNullTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");
        assertEquals(1, appVersion.compareTo(null));
    }

}