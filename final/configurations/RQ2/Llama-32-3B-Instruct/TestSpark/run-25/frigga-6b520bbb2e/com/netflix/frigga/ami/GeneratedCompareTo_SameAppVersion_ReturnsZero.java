package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_SameAppVersion_ReturnsZero {

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion("1.0-1");
        AppVersion appVersion2 = new AppVersion("1.0-1");
        int comparisonResult = appVersion1.compareTo(appVersion2);
        assertEquals(0, comparisonResult);
    }

}