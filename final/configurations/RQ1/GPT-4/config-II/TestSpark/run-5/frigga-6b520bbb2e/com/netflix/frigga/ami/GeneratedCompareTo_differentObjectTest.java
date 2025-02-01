package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareTo_differentObjectTest {

    @Test
    public void compareTo_differentObjectTest() {
        String testArgument = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        String testArgument2 = "subscriberhb-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(testArgument);
        AppVersion appVersion2 = AppVersion.parseName(testArgument2);

        int result = appVersion.compareTo(appVersion2);

        Assert.assertTrue(result < 0);
    }

}