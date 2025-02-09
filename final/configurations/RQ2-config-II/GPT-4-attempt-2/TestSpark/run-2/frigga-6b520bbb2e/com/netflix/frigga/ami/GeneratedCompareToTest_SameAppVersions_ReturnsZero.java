package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedCompareToTest_SameAppVersions_ReturnsZero {

    @Test
    public void compareToTest_SameAppVersions_ReturnsZero() {
        AppVersion appVersion1 = AppVersion.parseName("sameAppVersion");
        AppVersion appVersion2 = AppVersion.parseName("sameAppVersion");

        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}