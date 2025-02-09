package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertEquals("2.5.0", appVersion.getVersion());
    }

}