package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedCompareTo_equalTest {

    @Test
    public void compareTo_equalTest() {
        String amiName = "1.0.2-EC2-20210122";
        AppVersion appVersion = AppVersion.parseName(amiName);
        AppVersion other = new AppVersion();
        int result = appVersion.compareTo(other);
        assertEquals(0, result);
    }

}