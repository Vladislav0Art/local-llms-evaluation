package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestEqualsDifferentType {

    @Test
    public void testEqualsDifferentType() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150");

        Assert.assertFalse(appVersion.equals("just a string"));
    }

}