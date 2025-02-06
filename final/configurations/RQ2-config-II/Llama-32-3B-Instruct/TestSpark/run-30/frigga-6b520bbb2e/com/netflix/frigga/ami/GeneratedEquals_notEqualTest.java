package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedEquals_notEqualTest {

    @Test
    public void equals_notEqualTest() {
        String amiName = "1.0.2-EC2-20210122";
        AppVersion appVersion = AppVersion.parseName(amiName);
        AppVersion other = new AppVersion("2.0.3-EC2-20210123");
        boolean result = appVersion.equals(other);
        assertFalse(result);
    }

}