package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedCompareToEqualTest {

    @Test
    public void compareToEqualTest() {
        AppVersion version1 = AppVersion.parseName("app-version");
        AppVersion version2 = AppVersion.parseName("app-version");
        int result = version1.compareTo(version2);
        assertEquals(0, result);
    }

}