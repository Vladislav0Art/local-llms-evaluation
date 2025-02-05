package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedCompareToDifferentAppVersionTest {

    @Test
    public void compareToDifferentAppVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("name1");
        AppVersion appVersion2 = AppVersion.parseName("name2");
        Assert.assertNotEquals(0, appVersion1.compareTo(appVersion2));
    }

}