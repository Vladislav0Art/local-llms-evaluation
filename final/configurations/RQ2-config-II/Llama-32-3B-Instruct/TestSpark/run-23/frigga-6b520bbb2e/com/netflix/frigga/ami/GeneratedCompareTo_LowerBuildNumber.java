package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_LowerBuildNumber {

    @Test
    public void compareTo_LowerBuildNumber() {
        AppVersion appVersion1 = new AppVersion("1.0.0");
        AppVersion appVersion2 = new AppVersion("1.0.1");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}