package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("ami-App1-v1.0");
        assertEquals("ami-App1-v1.0", appVersion.toString());
    }

}