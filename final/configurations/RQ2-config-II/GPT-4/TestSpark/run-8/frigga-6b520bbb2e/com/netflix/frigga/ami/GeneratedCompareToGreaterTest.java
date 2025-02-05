package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedCompareToGreaterTest {

    @Test
    public void compareToGreaterTest() {
        AppVersion appVersion1 = new AppVersion("1.0.0");
        AppVersion appVersion2 = new AppVersion("0.9.0");
        int result = appVersion1.compareTo(appVersion2);
        Assert.assertTrue(result > 0);
    }

}