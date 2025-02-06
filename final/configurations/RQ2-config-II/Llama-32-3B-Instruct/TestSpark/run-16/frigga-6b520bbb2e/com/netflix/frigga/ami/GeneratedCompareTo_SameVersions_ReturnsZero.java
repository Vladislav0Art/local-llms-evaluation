package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCompareTo_SameVersions_ReturnsZero {

    @Test
    public void compareTo_SameVersions_ReturnsZero() {
        AppVersion first = new AppVersion("1.0");
        AppVersion second = new AppVersion("1.0");
        assertEquals(0, first.compareTo(second));
    }

}