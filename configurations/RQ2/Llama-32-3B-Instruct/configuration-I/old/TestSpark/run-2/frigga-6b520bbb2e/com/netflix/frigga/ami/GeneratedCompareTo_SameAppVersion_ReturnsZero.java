package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedCompareTo_SameAppVersion_ReturnsZero {

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        int result = appVersion.compareTo(appVersion);
        assertEquals(0, result);
    }

}