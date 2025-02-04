package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCompareTo_GivenNegativeEqualsReturnsPositive {

    @Test
    public void compareTo_GivenNegativeEqualsReturnsPositive() {
        AppVersion firstAppVersion = new AppVersion();
        AppVersion secondAppVersion = new AppVersion();
        secondAppVersion.setPackageName("a");
        firstAppVersion.setPackageName("b");
        assertEquals(1, firstAppVersion.compareTo(secondAppVersion));
    }

}