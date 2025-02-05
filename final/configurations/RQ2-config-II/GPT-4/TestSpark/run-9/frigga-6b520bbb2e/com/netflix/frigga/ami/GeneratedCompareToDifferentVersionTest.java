package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToDifferentVersionTest {

    @Test
    public void compareToDifferentVersionTest() {
        AppVersion appVersion1 = AppVersion.parseName("test-ami-1.0.0");
        AppVersion appVersion2 = AppVersion.parseName("test-ami-2.0.0");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}