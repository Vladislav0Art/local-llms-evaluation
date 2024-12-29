package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        AppVersion appVersion = new AppVersion();
        String result = appVersion.getVersion();
        assertNotNull(result);
    }

}