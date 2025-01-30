package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidPatternTest {

    @Test
    public void parseNameInvalidPatternTest() {
        assertNull(AppVersion.parseName("invalid-123"));
    }

}