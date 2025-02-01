package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedCompareToNullTest {

    @Test
    public void compareToNullTest() {
        AppVersion appVersionOne = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/WE-WAPP-subscriberha/150");

        int result = appVersionOne.compareTo(null);
        Assert.assertEquals(1, result);
    }

}