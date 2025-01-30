package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("test-package-0.1.0-h200/WE-WAPP-test-package/200");
        assertEquals("200", appVersion.getBuildNumber());
    }

}