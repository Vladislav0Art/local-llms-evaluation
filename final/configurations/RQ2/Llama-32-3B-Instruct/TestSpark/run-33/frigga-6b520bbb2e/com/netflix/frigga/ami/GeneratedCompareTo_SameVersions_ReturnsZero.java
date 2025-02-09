package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_SameVersions_ReturnsZero {

    @Test
    public void compareTo_SameVersions_ReturnsZero() {
        AppVersion version1 = new AppVersion("0.9.1-EC2-X86_64-GP2");
        AppVersion version2 = new AppVersion("0.9.1-EC2-X86_64-GP2");
        int result = version1.compareTo(version2);
        assertEquals(0, result);
    }

}