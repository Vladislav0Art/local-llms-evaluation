package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedGetBuildNumberTest {

    @Test
    public void getBuildNumberTest() {
        AppVersion version = AppVersion.parseName("app-1.0.0-h0.78cf3b2");
        assertNotNull(version.getBuildNumber());
        assertEquals("0", version.getBuildNumber());
    }

}