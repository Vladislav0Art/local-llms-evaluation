package com.netflix.frigga.ami;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("name-1.0.0-10-h123");
        Assert.assertEquals("name-1.0.0-10-h123", appVersion.toString());
    }

}