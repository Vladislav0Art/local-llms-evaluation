package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedGetPackageName ReturnsPackageName {

    @Test
    public void getPackageName

    ReturnsPackageName() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion result = AppVersion.parseName(amiName);
        assertEquals("subscriberha", result.getPackageName());
    }

}