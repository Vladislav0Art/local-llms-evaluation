package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToOtherTest {

    @Test
    public void compareToOtherTest() {
        String appName1 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        String appName2 = "subscriberha-1.0.1-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion1 = AppVersion.parseName(appName1);
        AppVersion appVersion2 = AppVersion.parseName(appName2);

        Assert.assertEquals(1, appVersion1.compareTo(appVersion2));
        Assert.assertEquals(-1, appVersion2.compareTo(appVersion1));
    }

}