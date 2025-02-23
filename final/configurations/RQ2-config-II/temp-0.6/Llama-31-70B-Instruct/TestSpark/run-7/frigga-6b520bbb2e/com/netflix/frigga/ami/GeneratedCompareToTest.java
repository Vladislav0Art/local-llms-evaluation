package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.packageName = "package1";
        appVersion1.version = "1.0.0";
        appVersion1.commit = "150";
        appVersion1.buildJobName = "WE-WAPP-subscriberha";
        appVersion1.buildNumber = "150";

        AppVersion appVersion2 = new AppVersion();
        appVersion2.packageName = "package2";
        appVersion2.version = "2.0.0";
        appVersion2.commit = "200";
        appVersion2.buildJobName = "WE-WAPP-subscriberha";
        appVersion2.buildNumber = "200";

        assertTrue(appVersion1.compareTo(appVersion2) < 0);
        assertTrue(appVersion2.compareTo(appVersion1) > 0);
        assertTrue(appVersion1.compareTo(appVersion1) == 0);
    }

}