package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCompareVersions_HigherVersionReturnsTrue {

    @Test
    public void compareVersions_HigherVersionReturnsTrue() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion();

        version1.setVersion("1.9");
        version2.setVersion("1.0");

        assertEquals(true, version1.compareTo(version2));
    }

}