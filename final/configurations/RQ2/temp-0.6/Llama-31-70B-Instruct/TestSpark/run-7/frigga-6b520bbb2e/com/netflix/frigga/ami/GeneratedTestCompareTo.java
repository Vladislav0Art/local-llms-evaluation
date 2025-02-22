package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCompareTo {

    @Test
    public void testCompareTo() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setPackageName("subscriberha");
        appVersion1.setVersion("1.0.0");
        appVersion1.setCommit("h150");

        AppVersion appVersion2 = new AppVersion();
        appVersion2.setPackageName("subscriberha");
        appVersion2.setVersion("1.0.1");
        appVersion2.setCommit("h150");

        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}