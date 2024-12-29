package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedCompareTo_SameAppVersion_ReturnsZero {

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion first = new AppVersion("test-version-1");
        AppVersion second = new AppVersion("test-version-1");
        assertEquals(0, first.compareTo(second));
    }

}