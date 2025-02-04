package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCompareTo_GivenEqualReturnsZero {

    @Test
    public void compareTo_GivenEqualReturnsZero() {
        AppVersion firstAppVersion = new AppVersion();
        AppVersion secondAppVersion = new AppVersion();
        assertEquals(0, firstAppVersion.compareTo(secondAppVersion));
    }

}