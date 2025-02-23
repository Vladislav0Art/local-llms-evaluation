package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setPackageName("subscriberha");
        appVersion1.setVersion("1.0.0");
        appVersion1.setBuildJobName("WE-WAPP-subscriberha");
        appVersion1.setBuildNumber("150");
        appVersion1.setCommit("h150");

        AppVersion appVersion2 = new AppVersion();
        appVersion2.setPackageName("subscriberha");
        appVersion2.setVersion("1.0.0");
        appVersion2.setBuildJobName("WE-WAPP-subscriberha");
        appVersion2.setBuildNumber("150");
        appVersion2.setCommit("h150");

        int result = appVersion1.compareTo(appVersion2);
        Assert.assertEquals(0, result);
    }

}