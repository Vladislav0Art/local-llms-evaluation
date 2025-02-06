package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_ReturnsCorrectEqualityResult {

    @Test
    public void equals_ReturnsCorrectEqualityResult() {
        AppVersion version1 = new AppVersion("1.0.2-1234");
        AppVersion version2 = new AppVersion("1.0.2-1234");
        assertTrue(version1.equals(version2));
    }

}