package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("MyApp-1.0.0-h1.1234");
        AppVersion appVersion2 = AppVersion.parseName("MyApp-1.0.0-h1.1234");
        AppVersion appVersion3 = AppVersion.parseName("MyApp-1.0.0-h2.1234");
        assertTrue(appVersion1.equals(appVersion2));
        assertFalse(appVersion1.equals(appVersion3));
    }

}