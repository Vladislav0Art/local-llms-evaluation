package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCompareAppVersions_DifferentValuesReturnsNegativeOrPositive {

    @Test
    public void compareAppVersions_DifferentValuesReturnsNegativeOrPositive() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setVersion("1.0.0");
        appVersion1.setCommit("123456");
        AppVersion appVersion2 = new AppVersion();
        appVersion2.setVersion("1.0.1");
        appVersion2.setCommit("123456");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}