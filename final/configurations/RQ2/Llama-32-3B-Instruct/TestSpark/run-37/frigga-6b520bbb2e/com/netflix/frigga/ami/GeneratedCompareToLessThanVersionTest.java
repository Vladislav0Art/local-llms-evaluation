package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareToLessThanVersionTest {

    @Test
    public void compareToLessThanVersionTest() {
        AppVersion version1 = new AppVersion("test", "1.0");
        AppVersion version2 = new AppVersion("test", "1.1");
        assertEquals(-1, version1.compareTo(version2));
    }

}