package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("ami-App1-v1.0");
        assertEquals("v1.0", appVersion.getVersion());
    }

}