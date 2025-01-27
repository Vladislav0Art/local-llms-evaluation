package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_SameBuildNumbersTest {

    @Test
    public void compareTo_SameBuildNumbersTest() {
        AppVersion appVersion1 = new AppVersion("0.9.2-0");
        AppVersion appVersion2 = new AppVersion("0.9.2-0");
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(0, result);
    }

}