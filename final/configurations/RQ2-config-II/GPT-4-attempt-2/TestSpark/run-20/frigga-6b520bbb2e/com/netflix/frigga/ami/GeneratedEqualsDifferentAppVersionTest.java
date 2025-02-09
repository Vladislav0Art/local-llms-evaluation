package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.Assert;

import java.util.regex.Pattern;

public class GeneratedEqualsDifferentAppVersionTest {

    @Test
    public void equalsDifferentAppVersionTest() {
        String name1 = "name-1.0.0-rc.1-h1.abc12";
        String name2 = "name-1.0.0-rc.1-h2.abc12";
        AppVersion appVersion1 = AppVersion.parseName(name1);
        AppVersion appVersion2 = AppVersion.parseName(name2);

        Assert.assertFalse(appVersion1.equals(appVersion2));
    }

}