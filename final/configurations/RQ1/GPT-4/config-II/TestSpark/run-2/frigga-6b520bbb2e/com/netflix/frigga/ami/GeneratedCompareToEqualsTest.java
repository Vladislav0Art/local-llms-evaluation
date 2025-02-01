package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedCompareToEqualsTest {

    @Test
    public void compareToEqualsTest() {
        AppVersion appVersionOne = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/WE-WAPP-subscriberha/150");
        AppVersion appVersionTwo = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/WE-WAPP-subscriberha/150");

        int result = appVersionOne.compareTo(appVersionTwo);
        Assert.assertEquals(0, result);
    }

}