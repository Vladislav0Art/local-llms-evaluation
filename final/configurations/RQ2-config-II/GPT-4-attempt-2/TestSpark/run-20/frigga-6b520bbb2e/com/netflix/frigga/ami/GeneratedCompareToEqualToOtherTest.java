package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedCompareToEqualToOtherTest {

    @Test
    public void compareToEqualToOtherTest() {
        AppVersion appVersion1 = AppVersion.parseName("name-1.0.0-rc.1-h1.abc12");
        AppVersion appVersion2 = AppVersion.parseName("name-1.0.0-rc.1-h1.abc12");

        Assert.assertTrue(appVersion1.compareTo(appVersion2) == 0);
    }

}