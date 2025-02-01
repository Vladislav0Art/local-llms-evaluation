package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestEqualsSameObject {

    @Test
    public void testEqualsSameObject() {
        String validAppName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(validAppName);

        Assert.assertTrue(appVersion.equals(appVersion));
    }

}