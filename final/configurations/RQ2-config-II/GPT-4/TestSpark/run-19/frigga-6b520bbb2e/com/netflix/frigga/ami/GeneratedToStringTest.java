package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.frigga.ami.AppVersion-testversion-commit-testCommit");
        String expectedResult = "com.netflix.frigga.ami.AppVersion: testversion, commit: testCommit";
        assertEquals(expectedResult, appVersion.toString());
    }

}