package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToNullTest {

    @Test
    public void compareToNullTest() {
        String appName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(appName);

        Assert.assertEquals(1, appVersion.compareTo(null));
    }

}