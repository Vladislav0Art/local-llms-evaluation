package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("test-package-0.1.0-h200/WE-WAPP-test-package/200");
        assertEquals("WE-WAPP-test-package", appVersion.getBuildJobName());
    }

}