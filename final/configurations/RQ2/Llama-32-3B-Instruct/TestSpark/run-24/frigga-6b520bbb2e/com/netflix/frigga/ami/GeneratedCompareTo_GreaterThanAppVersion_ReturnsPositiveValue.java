package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_GreaterThanAppVersion_ReturnsPositiveValue {

    @Test
    public void compareTo_GreaterThanAppVersion_ReturnsPositiveValue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("v2", "build 2");
        int result = appVersion1.compareTo(appVersion2);
        assertTrue(result > 0);
    }

}