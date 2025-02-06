package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedEquals_equalTest {

    @Test
    public void equals_equalTest() {
        String amiName = "1.0.2-EC2-20210122";
        AppVersion appVersion = AppVersion.parseName(amiName);
        AppVersion other = new AppVersion();
        boolean result = appVersion.equals(other);
        assertTrue(result);
    }

}