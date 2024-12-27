package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        String amiName1 = "AppName-v001";
        String amiName2 = "AppName-v002";

        AppVersion appVersion1 = AppVersion.parseName(amiName1);
        AppVersion appVersion2 = AppVersion.parseName(amiName2);

        int result = appVersion1.compareTo(appVersion2);

        Assert.assertTrue(result < 0);
    }

}