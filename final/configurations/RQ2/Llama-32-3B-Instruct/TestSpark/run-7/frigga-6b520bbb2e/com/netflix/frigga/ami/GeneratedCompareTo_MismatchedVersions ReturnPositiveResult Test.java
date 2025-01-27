package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_MismatchedVersions ReturnPositiveResult Test {

    @Test
    public void compareTo_MismatchedVersions

    ReturnPositiveResult Test() {
        AppVersion version1 = new AppVersion("1.0-123456789");
        AppVersion version2 = new AppVersion("2.0-123456789");
        int result = version1.compareTo(version2);
        assertEquals(1, result);
    }

}