package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToTestDifferentAppVersions {

    @Test
    public void compareToTestDifferentAppVersions() {
        AppVersion appVersion1 = AppVersion.parseName("myApp-1.0.0-h123456");
        AppVersion appVersion2 = AppVersion.parseName("myApp-2.0.0-h123456");

        int compare = appVersion1.compareTo(appVersion2);
        assertTrue(compare != 0);
    }

}