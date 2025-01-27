package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_LessThanAppVersion_ReturnsNegativeValue {

    @Test
    public void compareTo_LessThanAppVersion_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("v1", "build 1");
        int result = appVersion1.compareTo(appVersion2);
        assertTrue(result < 0);
    }

}