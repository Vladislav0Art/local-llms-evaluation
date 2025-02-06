package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_LessThan_ExpectedValue_ReturnsNegativeValue {

    @Test
    public void compareTo_LessThan_ExpectedValue_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("version", "build");
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(-1, result);
    }

}