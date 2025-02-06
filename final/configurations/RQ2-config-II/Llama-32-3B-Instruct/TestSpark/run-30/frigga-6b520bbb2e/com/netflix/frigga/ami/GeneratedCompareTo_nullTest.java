package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedCompareTo_nullTest {

    @Test
    public void compareTo_nullTest() {
        AppVersion other = new AppVersion();
        int result = new AppVersion().compareTo(other);
        assertEquals(-1, result);
    }

}