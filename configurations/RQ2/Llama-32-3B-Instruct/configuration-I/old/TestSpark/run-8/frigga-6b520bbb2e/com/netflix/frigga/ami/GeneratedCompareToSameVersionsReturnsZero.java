package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedCompareToSameVersionsReturnsZero {

    @Test
    public void compareToSameVersionsReturnsZero() {
        AppVersion sameVersion = new AppVersion();
        AppVersion otherVersion = new AppVersion();
        int comparisonResult = sameVersion.compareTo(otherVersion);
        assertEquals(0, comparisonResult);
    }

}