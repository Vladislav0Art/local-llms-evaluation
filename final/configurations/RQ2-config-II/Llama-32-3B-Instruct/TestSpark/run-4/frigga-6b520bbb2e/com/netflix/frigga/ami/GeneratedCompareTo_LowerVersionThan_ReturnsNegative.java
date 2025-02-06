package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_LowerVersionThan_ReturnsNegative {

    @Test
    public void compareTo_LowerVersionThan_ReturnsNegative() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion("0.9");
        assertEquals(-1, version1.compareTo(version2));
    }

}