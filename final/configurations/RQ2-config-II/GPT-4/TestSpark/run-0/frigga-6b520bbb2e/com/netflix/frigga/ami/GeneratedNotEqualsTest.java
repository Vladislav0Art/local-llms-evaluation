package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedNotEqualsTest {

    @Test
    public void notEqualsTest() {
        AppVersion appVersion1 = AppVersion.parseName("name1");
        AppVersion appVersion2 = AppVersion.parseName("name2");
        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

}