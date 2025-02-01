package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String appName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(appName);
        String result = appVersion.toString();

        Assert.assertTrue(result.contains("AppVersion"));
        Assert.assertTrue(result.contains("packageName=subscriberha"));
        Assert.assertTrue(result.contains(", version=1.0.0"));
        Assert.assertTrue(result.contains(", buildJobName=WE-WAPP-subscriberha"));
        Assert.assertTrue(result.contains(", buildNumber=586499"));
        Assert.assertTrue(result.contains(", changelist=h150"));
        Assert.assertTrue(result.contains("]"));
    }

}