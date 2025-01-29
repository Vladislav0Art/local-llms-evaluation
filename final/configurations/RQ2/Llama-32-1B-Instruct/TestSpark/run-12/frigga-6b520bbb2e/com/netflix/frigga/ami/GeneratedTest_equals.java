package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTest_equals {

    @Test
    public void test_equals() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();

        // Test for equals with different package names
        assertTrue(appVersion1.equals("ami-abc123"));
        assertFalse(appVersion1.equals("ami-bc123"));

        // Test for equals with same package name and version
        assertEquals(appVersion1, appVersion2);

        // Test for equals with different packages
        assertEquals(appVersion2, appVersion1);
    }

}