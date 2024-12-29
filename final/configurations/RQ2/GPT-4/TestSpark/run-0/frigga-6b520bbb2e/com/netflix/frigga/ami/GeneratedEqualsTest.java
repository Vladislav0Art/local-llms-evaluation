package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion = AppVersion.parseName("amiName");
        AppVersion sameAppVersion = appVersion;
        Assert.assertTrue(appVersion.equals(sameAppVersion));
        AppVersion differentAppVersion = AppVersion.parseName("differentAmiName");
        Assert.assertFalse(appVersion.equals(differentAppVersion));
    }

}