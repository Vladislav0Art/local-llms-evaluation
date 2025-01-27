package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCompareVersions_EqualVersionReturnsFalse {

    @Test
    public void compareVersions_EqualVersionReturnsFalse() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion();

        version1.setVersion("1.0");
        version2.setVersion("1.0");

        assertEquals(false, version1.compareTo(version2));
    }

}