package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("name1");
        AppVersion appVersion2 = AppVersion.parseName("name1");
        Assert.assertTrue(appVersion1.equals(appVersion2));
    }

}