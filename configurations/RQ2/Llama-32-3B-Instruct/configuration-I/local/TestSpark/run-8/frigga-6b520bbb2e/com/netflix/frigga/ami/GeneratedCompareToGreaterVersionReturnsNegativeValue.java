package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedCompareToGreaterVersionReturnsNegativeValue {

    @Test
    public void compareToGreaterVersionReturnsNegativeValue() {
        AppVersion greaterVersion = new AppVersion("2.0-1");
        AppVersion lessVersion = new AppVersion("1.0-1");
        int comparisonResult = greaterVersion.compareTo(lessVersion);
        assertEquals(-1, comparisonResult);
    }

}