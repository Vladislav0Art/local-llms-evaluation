package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCompareTo_LargerVersion_ReturnsNegativeValue {

    @Test
    public void compareTo_LargerVersion_ReturnsNegativeValue() {
        AppVersion first = new AppVersion("1.0");
        AppVersion second = new AppVersion("2.0");
        assertLessThan(-1, first.compareTo(second));
    }

}