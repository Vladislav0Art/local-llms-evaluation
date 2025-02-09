package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_DifferentVersions_ReturnsNegativeNumber {

    @Test
    public void compareTo_DifferentVersions_ReturnsNegativeNumber() {
        AppVersion version1 = new AppVersion("0.9.1-EC2-X86_64-GP2");
        AppVersion version2 = new AppVersion("0.10.0-EC2-X86_64-GP2");
        int result = version1.compareTo(version2);
        assertTrue(result < 0);
    }

}