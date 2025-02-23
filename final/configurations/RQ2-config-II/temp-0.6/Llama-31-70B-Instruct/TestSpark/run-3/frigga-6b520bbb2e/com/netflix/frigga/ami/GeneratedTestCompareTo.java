package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestCompareTo {

    @Test
    public void testCompareTo() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();

        int result = appVersion1.compareTo(appVersion2);
        Assert.assertEquals(0, result);
    }

}