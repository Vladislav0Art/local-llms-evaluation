package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCompareTo_DifferentAppVersion_ReturnsNegativeValue {

    @Test
    public void compareTo_DifferentAppVersion_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("ami-1234abcde7890fghi123");
        int result = appVersion1.compareTo(appVersion2);
        assertLessThan(0, result);
    }

}