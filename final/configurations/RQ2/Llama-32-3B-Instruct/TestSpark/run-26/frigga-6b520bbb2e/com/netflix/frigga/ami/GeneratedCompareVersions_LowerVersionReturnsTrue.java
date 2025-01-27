package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCompareVersions_LowerVersionReturnsTrue {

    @Test
    public void compareVersions_LowerVersionReturnsTrue() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion();

        version1.setVersion("0.9");
        version2.setVersion("1.0");

        assertEquals(true, version1.compareTo(version2));
    }

}