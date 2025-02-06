package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedEquals_nullTest {

    @Test
    public void equals_nullTest() {
        AppVersion other = new AppVersion();
        boolean result = new AppVersion().equals(other);
        assertFalse(result);
    }

}