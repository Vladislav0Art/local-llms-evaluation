package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedCompareToEqualAppVersionTest {

    @Test
    public void compareToEqualAppVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("name1");
        AppVersion appVersion2 = AppVersion.parseName("name1");
        Assert.assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}