package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedCompareToTest_SameVersions {

    @Test
    public void compareToTest_SameVersions() {
        AppVersion appVersion1 = AppVersion.parseName("myAmiName-mine-1-h123");
        AppVersion appVersion2 = AppVersion.parseName("myAmiName-mine-1-h123");

        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}