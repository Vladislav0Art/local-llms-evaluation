package com.netflix.frigga.ami;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

import static org.junit.Assert.*;

public class GeneratedCompareToSameObjectsTest {

    @Test
    public void compareToSameObjectsTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");

        // If the object is being compared to itself, compareTo should return 0
        assertEquals(0, appVersion.compareTo(appVersion));
    }

}