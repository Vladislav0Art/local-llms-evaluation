package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedEqualsSameAppVersionTest {

    @Test
    public void equalsSameAppVersionTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);
        AppVersion sameAppVersion = AppVersion.parseName(name);

        Assert.assertTrue(appVersion.equals(sameAppVersion));
    }

}