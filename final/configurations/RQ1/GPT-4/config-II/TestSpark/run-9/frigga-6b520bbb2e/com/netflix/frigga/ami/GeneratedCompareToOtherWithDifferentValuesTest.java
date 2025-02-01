package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedCompareToOtherWithDifferentValuesTest {

    @Test
    public void compareToOtherWithDifferentValuesTest() {
        AppVersion appVersion1 = AppVersion.parseName("packageName-1.0.0-h100/commits/10");
        AppVersion appVersion2 = AppVersion.parseName("packageName-2.0.0-h200/commits/20");
        int comparison = appVersion1.compareTo(appVersion2);
        Assert.assertEquals(-1, comparison);
    }

}