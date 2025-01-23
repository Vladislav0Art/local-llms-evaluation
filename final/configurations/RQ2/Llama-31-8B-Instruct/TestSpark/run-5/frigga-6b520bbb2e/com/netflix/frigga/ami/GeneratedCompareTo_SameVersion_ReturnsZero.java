package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedCompareTo_SameVersion_ReturnsZero {

    @Test
    public void compareTo_SameVersion_ReturnsZero() {
        AppVersion version1 = AppVersion.parseName("ami-name-1.2.3");
        AppVersion version2 = AppVersion.parseName("ami-name-1.2.3");
        int result = version1.compareTo(version2);
        assertEquals(0, result);
    }

}