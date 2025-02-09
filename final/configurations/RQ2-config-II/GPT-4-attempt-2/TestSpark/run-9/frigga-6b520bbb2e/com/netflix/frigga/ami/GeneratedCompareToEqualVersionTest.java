package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedCompareToEqualVersionTest {

    @Test
    public void compareToEqualVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("version1");
        AppVersion appVersion2 = AppVersion.parseName("version1");
        Assert.assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}