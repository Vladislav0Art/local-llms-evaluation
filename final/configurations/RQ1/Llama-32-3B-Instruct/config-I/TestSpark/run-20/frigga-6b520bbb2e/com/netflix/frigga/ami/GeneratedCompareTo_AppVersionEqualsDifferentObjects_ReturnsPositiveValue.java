package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedCompareTo_AppVersionEqualsDifferentObjects_ReturnsPositiveValue {

    @Test
    public void compareTo_AppVersionEqualsDifferentObjects_ReturnsPositiveValue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        appVersion1.setBuildJobName("job1");
        assertEquals(1, appVersion1.compareTo(appVersion2));
    }

}