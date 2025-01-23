package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedCompareTo_GreaterVersion_ReturnsPositive {

    @Test
    public void compareTo_GreaterVersion_ReturnsPositive() {
        AppVersion version1 = AppVersion.parseName("ami-name-1.2.3");
        AppVersion version2 = AppVersion.parseName("ami-name-1.2.4");
        int result = version1.compareTo(version2);
        assertTrue(result > 0);
    }

}