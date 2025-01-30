package com.netflix.frigga.ami;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

import static org.junit.Assert.*;

public class GeneratedNullSafeStringComparatorTest {

    @Test
    public void nullSafeStringComparatorTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499");

        assertEquals(0, appVersion.compareTo(appVersion));
        assertEquals(-1, appVersion.compareTo(null));
    }

}