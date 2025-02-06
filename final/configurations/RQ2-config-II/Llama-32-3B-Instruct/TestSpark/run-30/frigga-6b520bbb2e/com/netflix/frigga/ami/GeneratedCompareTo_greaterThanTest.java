package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedCompareTo_greaterThanTest {

    @Test
    public void compareTo_greaterThanTest() {
        String amiName = "1.0.2-EC2-20210122";
        AppVersion appVersion = AppVersion.parseName(amiName);
        AppVersion other = new AppVersion("2.0.3-EC2-20210122");
        int result = appVersion.compareTo(other);
        assertEquals(1, result);
    }

}