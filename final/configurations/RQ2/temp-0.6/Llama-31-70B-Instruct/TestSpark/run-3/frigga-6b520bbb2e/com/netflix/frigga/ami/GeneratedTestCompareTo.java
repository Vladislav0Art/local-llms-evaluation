package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class GeneratedTestCompareTo {

    @Test
    public void testCompareTo() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        appVersion1.setPackageName("test1");
        appVersion1.setVersion("1.0.0");
        appVersion1.setBuildJobName("buildJobName");
        appVersion1.setBuildNumber("123");
        appVersion1.setCommit("commit");

        appVersion2.setPackageName("test2");
        appVersion2.setVersion("1.0.0");
        appVersion2.setBuildJobName("buildJobName");
        appVersion2.setBuildNumber("123");
        appVersion2.setCommit("commit");

        assertNotEquals(0, appVersion1.compareTo(appVersion2));
        appVersion2.setPackageName("test1");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}