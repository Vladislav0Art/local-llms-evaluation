package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_SameVersionsReturnZero {

    @Test
    public void compareTo_SameVersionsReturnZero() {
        AppVersion version1 = new AppVersion("ami-1234", 12, 34);
        AppVersion version2 = new AppVersion("ami-1234", 12, 34);
        assertEquals(0, version1.compareTo(version2));
    }

}