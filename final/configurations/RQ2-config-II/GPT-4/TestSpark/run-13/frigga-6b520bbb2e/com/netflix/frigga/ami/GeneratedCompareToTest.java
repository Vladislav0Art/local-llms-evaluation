package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("packageName-1.0.0-h12.abcdefg");
        AppVersion appVersion2 = AppVersion.parseName("packageName-1.0.0-h13.abcdefg");
        Assert.assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}