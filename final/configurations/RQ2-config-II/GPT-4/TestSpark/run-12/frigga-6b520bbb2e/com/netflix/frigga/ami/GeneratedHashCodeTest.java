package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion1 = AppVersion.parseName("MyApp-1.0.0-h1.1234");
        AppVersion appVersion2 = AppVersion.parseName("MyApp-1.0.0-h1.1234");
        AppVersion appVersion3 = AppVersion.parseName("MyApp-1.0.0-h2.1234");
        assertEquals(appVersion1.hashCode(), appVersion2.hashCode());
        assertNotEquals(appVersion1.hashCode(), appVersion3.hashCode());
    }

}