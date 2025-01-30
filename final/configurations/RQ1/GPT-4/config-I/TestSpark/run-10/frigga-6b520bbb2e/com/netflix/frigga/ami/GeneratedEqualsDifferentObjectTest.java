package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        AppVersion appVersion = AppVersion.parseName("test-package-0.1.0-h200/WE-WAPP-test-package/200");
        AppVersion anotherAppVersion = AppVersion.parseName("test-package-0.1.0-h201/WE-WAPP-test-package/201");
        assertFalse(appVersion.equals(anotherAppVersion));
    }

}