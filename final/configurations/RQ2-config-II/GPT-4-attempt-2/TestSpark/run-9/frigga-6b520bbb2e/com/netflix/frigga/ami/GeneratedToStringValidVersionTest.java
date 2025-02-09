package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedToStringValidVersionTest {

    @Test
    public void toStringValidVersionTest() {
        AppVersion appVersion = AppVersion.parseName("version.toString");
        Assert.assertEquals("version.toString", appVersion.toString());
    }

}