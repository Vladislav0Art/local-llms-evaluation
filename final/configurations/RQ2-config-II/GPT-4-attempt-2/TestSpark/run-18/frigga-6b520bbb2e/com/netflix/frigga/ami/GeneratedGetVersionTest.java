package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.package-1.0.0-h0.abc123");
        assertEquals("1.0.0", appVersion.getVersion());
    }

}