package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_DifferentVersionsCompareCorrectly {

    @Test
    public void compareTo_DifferentVersionsCompareCorrectly() {
        AppVersion version1 = new AppVersion("1.0.2-1234");
        AppVersion version2 = new AppVersion("1.0.3-5678");
        assertEquals(-1, version1.compareTo(version2));
    }

}