package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidInputTest {

    @Test
    public void parseNameInvalidInputTest() {
        AppVersion parsedAppVersion = AppVersion.parseName("invalid-input");

        assertNull(parsedAppVersion);
    }

}