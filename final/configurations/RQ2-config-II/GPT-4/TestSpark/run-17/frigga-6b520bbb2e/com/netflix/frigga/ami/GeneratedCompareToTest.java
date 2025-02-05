package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("hai-3.4.5-h33");
        AppVersion appVersion2 = AppVersion.parseName("hai-3.4.5-h34");
        int compareValue = appVersion1.compareTo(appVersion2);
        Assert.assertTrue(compareValue < 0);
    }

}