package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_MatchesExactComparison Test {

    @Test
    public void equals_MatchesExactComparison

    Test() {
        AppVersion version1 = new AppVersion("1.0-123456789");
        AppVersion version2 = new AppVersion("1.0-123456789");
        assertTrue(version1.equals(version2));
    }

}