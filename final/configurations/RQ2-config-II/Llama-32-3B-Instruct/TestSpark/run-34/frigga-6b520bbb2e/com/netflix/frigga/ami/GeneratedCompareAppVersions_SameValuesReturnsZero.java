package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCompareAppVersions_SameValuesReturnsZero {

    @Test
    public void compareAppVersions_SameValuesReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setVersion("1.0.0");
        appVersion1.setCommit("123456");
        AppVersion appVersion2 = new AppVersion();
        appVersion2.setVersion("1.0.0");
        appVersion2.setCommit("123456");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}