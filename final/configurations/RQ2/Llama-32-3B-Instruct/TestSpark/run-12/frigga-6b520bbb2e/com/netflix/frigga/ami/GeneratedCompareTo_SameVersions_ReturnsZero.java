package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_SameVersions_ReturnsZero {

    @Test
    public void compareTo_SameVersions_ReturnsZero() {
        AppVersion version = new AppVersion();
        int result = version.compareTo(version);
        assertEquals(0, result);
    }

}