package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_GreaterThanReturnsPlusOne {

    @Test
    public void compareTo_GreaterThanReturnsPlusOne() {
        AppVersion appVersion1 = new AppVersion("1.0-1234567890");
        AppVersion appVersion2 = new AppVersion("1.0-1234567891");
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(1, result);
    }

}