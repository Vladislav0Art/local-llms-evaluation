package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        String name = "name-1.0.0-rc.1-h1.abc12";
        AppVersion appVersion = AppVersion.parseName(name);

        Assert.assertEquals("name", appVersion.getPackageName());
    }

}