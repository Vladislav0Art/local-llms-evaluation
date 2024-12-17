package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedCompareTo_GreaterAppVersion_ReturnsPositiveInt {

    @Test
    public void compareTo_GreaterAppVersion_ReturnsPositiveInt() {
        AppVersion appVersion1 = new AppVersion(1, 2, 3);
        AppVersion appVersion2 = new AppVersion(1, 4, 6);
        int result = appVersion1.compareTo(appVersion2);
        assertTrue(result > 0);
    }

}