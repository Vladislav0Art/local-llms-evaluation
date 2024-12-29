package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedCompareTo_DifferentAppVersion_ReturnsNegativeInt {

    @Test
    public void compareTo_DifferentAppVersion_ReturnsNegativeInt() {
        AppVersion first = new AppVersion("test-version-2");
        AppVersion second = new AppVersion("test-version-1");
        assertEquals(-1, first.compareTo(second));
    }

}