package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion ReturnsCorrectVersion {

    @Test
    public void getVersion

    ReturnsCorrectVersion() {
        String version = AppVersion.getVersion();
        assertNotNull(version);
        assertEquals("1.0.0", version);
    }

}