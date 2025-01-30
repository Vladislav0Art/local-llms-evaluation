package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCompareToNullTest {

    @Test
    public void compareToNullTest() {
        AppVersion appVersion = AppVersion.parseName("test-package-0.1.0-h200/WE-WAPP-test-package/200");
        assertEquals(1, appVersion.compareTo(null));
    }

}