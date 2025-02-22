package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

public class GeneratedTestCompareTo {

    @Test
    public void testCompareTo() {
        AppVersion left = AppVersion.parseName("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        AppVersion right = AppVersion.parseName("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");
        assertEquals(0, left.compareTo(right));
    }

}