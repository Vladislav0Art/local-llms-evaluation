package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedCompareTo_LowestVersionFirstTest {

    @Test
    public void compareTo_LowestVersionFirstTest() {
        AppVersion version1 = new AppVersion("1.0.2-20180808T1439Z");
        AppVersion version2 = new AppVersion("1.0.3-20180808T1439Z");
        assertEquals(-1, version1.compareTo(version2));
    }

}