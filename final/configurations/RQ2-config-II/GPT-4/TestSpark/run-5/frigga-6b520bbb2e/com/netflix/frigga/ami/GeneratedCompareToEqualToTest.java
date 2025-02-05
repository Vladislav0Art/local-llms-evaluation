package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedCompareToEqualToTest {

    @Test
    public void compareToEqualToTest() {
        AppVersion version1 = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        AppVersion version2 = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertEquals(0, version1.compareTo(version2));
    }

}