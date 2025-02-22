package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class GeneratedTestCompareTo_sameAppversion {

    @Test
    public void testCompareTo_sameAppversion() {
        String appversion = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion parsedAppversion = AppVersion.parseName(appversion);
        int result = parsedAppversion.compareTo(parsedAppversion);
        assertEquals(0, result);
    }

}