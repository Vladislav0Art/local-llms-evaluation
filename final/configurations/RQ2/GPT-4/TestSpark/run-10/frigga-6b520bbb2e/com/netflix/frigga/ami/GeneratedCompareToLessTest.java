package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedCompareToLessTest {

    @Test
    public void compareToLessTest() {
        AppVersion version1 = AppVersion.parseName("app-version1");
        AppVersion version2 = AppVersion.parseName("app-version2");
        int result = version1.compareTo(version2);
        assertTrue(result < 0);
    }

}