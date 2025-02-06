package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_HigherVersionThan_ReturnsPositive {

    @Test
    public void compareTo_HigherVersionThan_ReturnsPositive() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion("1.0");
        assertEquals(1, version1.compareTo(version2));
    }

}