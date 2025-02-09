package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        assertNotNull(AppVersion.parseName("com.netflix.package-1.0.0-h0.abc123"));
    }

}