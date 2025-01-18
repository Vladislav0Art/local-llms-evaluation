package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToLessTest {

    @Test
    public void compareToLessTest() {
        AppVersion appVersion1 = AppVersion.parseName("AppName2-version2-buildJob2-buildNumber2-commit2");
        AppVersion appVersion2 = AppVersion.parseName("AppName1-version1-buildJob1-buildNumber1-commit1");
        assertTrue(appVersion1.compareTo(appVersion2) > 0);
    }

}