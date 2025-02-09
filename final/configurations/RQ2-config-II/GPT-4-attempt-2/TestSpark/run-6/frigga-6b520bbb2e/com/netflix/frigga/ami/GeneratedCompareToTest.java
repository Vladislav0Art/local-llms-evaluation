package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        String amiName = "name1";
        AppVersion appVersion1 = AppVersion.parseName(amiName);
        String amiName2 = "name2";
        AppVersion appVersion2 = AppVersion.parseName(amiName2);
        int compare = appVersion1.compareTo(appVersion2);
        Assert.assertTrue(compare != 0);
    }

}