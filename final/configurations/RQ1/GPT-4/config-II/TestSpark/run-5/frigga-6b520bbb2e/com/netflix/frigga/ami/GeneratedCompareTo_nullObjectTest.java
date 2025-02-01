package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareTo_nullObjectTest {

    @Test
    public void compareTo_nullObjectTest() {
        String testArgument = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(testArgument);

        int result = appVersion.compareTo(null);

        Assert.assertEquals(1, result);
    }

}