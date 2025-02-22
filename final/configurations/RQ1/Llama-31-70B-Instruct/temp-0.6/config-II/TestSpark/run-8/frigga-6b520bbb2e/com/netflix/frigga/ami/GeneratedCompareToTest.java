package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedCompareToTest {

    private AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setPackageName("subscriberha");
        appVersion1.setVersion("1.0.0");
        appVersion1.setBuildNumber("1");

        AppVersion appVersion2 = new AppVersion();
        appVersion2.setPackageName("subscriberha");
        appVersion2.setVersion("1.0.0");
        appVersion2.setBuildNumber("2");

        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}