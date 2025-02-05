package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("test-ami-0.0.1-build01-g123abc");
        assertEquals("test-ami-0.0.1-build01-g123abc", appVersion.toString());
    }

}