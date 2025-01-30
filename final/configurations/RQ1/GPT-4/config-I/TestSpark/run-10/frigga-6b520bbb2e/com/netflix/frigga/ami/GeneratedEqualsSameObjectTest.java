package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsSameObjectTest {

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("test-package-0.1.0-h200/WE-WAPP-test-package/200");
        assertTrue(appVersion.equals(appVersion));
    }

}