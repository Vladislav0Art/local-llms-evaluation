package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("appVersion1");
        AppVersion appVersion2 = AppVersion.parseName("appVersion2");
        int out = appVersion1.compareTo(appVersion2);
        Assert.assertNotEquals(0, out);
    }

}