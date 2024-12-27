package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedCompareToEqualAppVersionTest {

    @Test
    public void compareToEqualAppVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("validAmi");
        AppVersion appVersion2 = AppVersion.parseName("validAmi");

        // they are equal so compareTo method should return 0
        Assert.assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}