package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCompareTo_SameAppVersion_ReturnsZero {

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion("1.0");
        AppVersion appVersion2 = new AppVersion("1.0");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}