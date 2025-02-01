package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameNullAmiNameTest {

    @Test
    public void parseNameNullAmiNameTest() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

}