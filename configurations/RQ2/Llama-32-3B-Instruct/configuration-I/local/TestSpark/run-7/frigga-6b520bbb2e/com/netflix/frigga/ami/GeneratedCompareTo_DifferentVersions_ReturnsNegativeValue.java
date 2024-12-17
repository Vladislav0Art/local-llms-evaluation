package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCompareTo_DifferentVersions_ReturnsNegativeValue {

    @Test
    public void compareTo_DifferentVersions_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion("1.0", "rc2");
        AppVersion appVersion2 = new AppVersion("1.1", "rc3");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}