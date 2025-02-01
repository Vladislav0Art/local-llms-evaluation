package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedCompareToNullTest {

    @Test
    public void compareToNullTest() {
        AppVersion appVersion = AppVersion.parseName("packageName-1.2.3-h123/commits/12");
        int comparison = appVersion.compareTo(null);
        Assert.assertEquals(1, comparison);
    }

}