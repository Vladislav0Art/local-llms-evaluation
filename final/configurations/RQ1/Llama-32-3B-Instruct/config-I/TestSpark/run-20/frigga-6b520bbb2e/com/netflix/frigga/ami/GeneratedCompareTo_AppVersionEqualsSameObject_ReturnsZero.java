package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedCompareTo_AppVersionEqualsSameObject_ReturnsZero {

    @Test
    public void compareTo_AppVersionEqualsSameObject_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        assertEquals(0, appVersion1.compareTo(appVersion1));
    }

}