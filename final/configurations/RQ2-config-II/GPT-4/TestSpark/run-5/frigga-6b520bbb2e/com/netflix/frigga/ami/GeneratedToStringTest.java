package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertNotNull(version.toString());
        assertEquals("app-1.0.0-h0.78cf3b2", version.toString());
    }

}