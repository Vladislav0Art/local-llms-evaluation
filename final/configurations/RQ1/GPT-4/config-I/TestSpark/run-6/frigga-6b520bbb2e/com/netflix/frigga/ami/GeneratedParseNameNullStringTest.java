package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameNullStringTest {

    @Test
    public void parseNameNullStringTest() {
        AppVersion parsedName = AppVersion.parseName(null);

        assertNull(parsedName);
    }

}