package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("name-1.0.0-10-h123");
        AppVersion appVersion2 = AppVersion.parseName("name-1.0.0-20-h123");
        Assert.assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}