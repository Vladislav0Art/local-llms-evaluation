package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("app-2.5.0-h82.8af1b42");
        assertEquals("app-2.5.0-h82.8af1b42", appVersion.toString());
    }

}