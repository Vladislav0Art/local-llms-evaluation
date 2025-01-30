package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeNotNullTest {

    @Test
    public void hashCodeNotNullTest() {
        AppVersion appVersion = AppVersion.parseName("test-package-0.1.0-h200/WE-WAPP-test-package/200");
        assertNotNull(appVersion.hashCode());
    }

}