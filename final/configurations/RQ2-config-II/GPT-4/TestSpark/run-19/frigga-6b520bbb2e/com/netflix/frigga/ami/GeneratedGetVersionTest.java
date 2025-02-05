package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.frigga.ami.AppVersion-testversion");
        assertEquals("testversion", appVersion.getVersion());
    }

}