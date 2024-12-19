package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCompareVersions_LowerVersion_ReturnsNegative {

    @Test
    public void compareVersions_LowerVersion_ReturnsNegative() {
        AppVersion appVersion1 = new AppVersion("1.2.3");
        AppVersion appVersion2 = new AppVersion("1.2.2");
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(-1, result);
    }

}