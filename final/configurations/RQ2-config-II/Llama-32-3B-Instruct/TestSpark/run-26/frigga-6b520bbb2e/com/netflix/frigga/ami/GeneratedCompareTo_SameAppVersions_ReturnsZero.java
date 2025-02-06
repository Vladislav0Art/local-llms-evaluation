package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCompareTo_SameAppVersions_ReturnsZero {

    @Test
    public void compareTo_SameAppVersions_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        AppVersion appVersion2 = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}