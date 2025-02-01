package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedCompareToNotEqualsTest {

    @Test
    public void compareToNotEqualsTest() {
        AppVersion appVersionOne = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/WE-WAPP-subscriberha/150");
        AppVersion appVersionTwo = AppVersion.parseName("othersubscriber-1.1.1-h588899.h155/WE-WAPP-othersubscriber/155");

        int result = appVersionOne.compareTo(appVersionTwo);
        Assert.assertNotEquals(0, result);
    }

}