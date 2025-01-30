package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidPatternTest {

    @Test
    public void parseNameInvalidPatternTest() {
        String invalidPattern = "invalid-pattern";
        AppVersion parsedName = AppVersion.parseName(invalidPattern);

        assertNull(parsedName);
    }

}