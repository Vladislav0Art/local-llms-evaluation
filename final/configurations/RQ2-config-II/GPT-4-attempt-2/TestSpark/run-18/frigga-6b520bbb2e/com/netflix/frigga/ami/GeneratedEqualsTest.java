package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("com.netflix.package-1.0.0-h0.abc123");
        AppVersion appVersion2 = AppVersion.parseName("com.netflix.package-1.0.0-h0.abc123");
        assertTrue(appVersion1.equals(appVersion2));
    }

}