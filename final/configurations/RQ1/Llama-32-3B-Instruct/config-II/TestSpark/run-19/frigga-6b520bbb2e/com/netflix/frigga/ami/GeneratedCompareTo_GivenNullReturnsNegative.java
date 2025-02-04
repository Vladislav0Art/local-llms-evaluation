package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCompareTo_GivenNullReturnsNegative {

    @Test
    public void compareTo_GivenNullReturnsNegative() {
        AppVersion firstAppVersion = new AppVersion();
        AppVersion secondAppVersion = null;
        int result = firstAppVersion.compareTo(secondAppVersion);
        assertEquals(-1, result);
    }

}