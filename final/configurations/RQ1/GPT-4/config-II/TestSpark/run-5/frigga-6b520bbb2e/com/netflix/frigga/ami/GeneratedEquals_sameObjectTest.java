package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEquals_sameObjectTest {

    @Test
    public void equals_sameObjectTest() {
        String testArgument = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(testArgument);

        boolean result = appVersion.equals(appVersion);

        Assert.assertTrue(result);
    }

}