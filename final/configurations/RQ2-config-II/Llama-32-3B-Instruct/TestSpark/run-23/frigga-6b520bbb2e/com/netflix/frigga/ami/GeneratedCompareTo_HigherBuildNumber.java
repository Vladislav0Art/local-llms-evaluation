package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_HigherBuildNumber {

    @Test
    public void compareTo_HigherBuildNumber() {
        AppVersion appVersion1 = new AppVersion("1.0.0");
        AppVersion appVersion2 = new AppVersion("1.0.1");
        assertTrue(appVersion1.compareTo(appVersion2) > 0);
    }

}