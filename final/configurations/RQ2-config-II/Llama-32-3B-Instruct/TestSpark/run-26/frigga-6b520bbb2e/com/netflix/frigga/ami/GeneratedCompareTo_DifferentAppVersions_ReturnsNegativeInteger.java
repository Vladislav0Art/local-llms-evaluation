package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCompareTo_DifferentAppVersions_ReturnsNegativeInteger {

    @Test
    public void compareTo_DifferentAppVersions_ReturnsNegativeInteger() {
        AppVersion appVersion1 = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        AppVersion appVersion2 = new AppVersion("com.netflix.frigga", "2.0", "9876543210");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}