package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameNullInputTest {

    @Test
    public void parseNameNullInputTest() {
        AppVersion parsedAppVersion = AppVersion.parseName(null);

        assertNull(parsedAppVersion);
    }

}