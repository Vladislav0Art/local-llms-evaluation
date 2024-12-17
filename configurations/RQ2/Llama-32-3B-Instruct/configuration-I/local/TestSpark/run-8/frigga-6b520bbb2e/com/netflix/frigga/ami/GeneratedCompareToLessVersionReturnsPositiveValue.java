package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedCompareToLessVersionReturnsPositiveValue {

    @Test
    public void compareToLessVersionReturnsPositiveValue() {
        AppVersion lesserVersion = new AppVersion("1.0-1");
        AppVersion greaterVersion = new AppVersion("2.0-1");
        int comparisonResult = greaterVersion.compareTo(lesserVersion);
        assertEquals(1, comparisonResult);
    }

}