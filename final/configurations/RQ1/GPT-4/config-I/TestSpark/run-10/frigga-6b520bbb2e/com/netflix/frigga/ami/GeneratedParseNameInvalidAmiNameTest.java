package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameInvalidAmiNameTest {

    @Test
    public void parseNameInvalidAmiNameTest() {
        String invalidAmiName = "invalid-format";
        assertNull(AppVersion.parseName(invalidAmiName));
    }

}