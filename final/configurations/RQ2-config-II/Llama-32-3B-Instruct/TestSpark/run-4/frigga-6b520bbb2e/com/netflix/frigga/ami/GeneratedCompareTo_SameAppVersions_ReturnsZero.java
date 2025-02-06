package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_SameAppVersions_ReturnsZero {

    @Test
    public void compareTo_SameAppVersions_ReturnsZero() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion();
        assertEquals(0, version1.compareTo(version2));
    }

}