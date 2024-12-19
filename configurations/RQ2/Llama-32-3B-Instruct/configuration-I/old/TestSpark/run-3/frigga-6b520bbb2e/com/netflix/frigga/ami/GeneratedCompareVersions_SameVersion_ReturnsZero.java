package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCompareVersions_SameVersion_ReturnsZero {

    @Test
    public void compareVersions_SameVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion("1.2.3");
        AppVersion appVersion2 = new AppVersion("1.2.3");
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(0, result);
    }

}