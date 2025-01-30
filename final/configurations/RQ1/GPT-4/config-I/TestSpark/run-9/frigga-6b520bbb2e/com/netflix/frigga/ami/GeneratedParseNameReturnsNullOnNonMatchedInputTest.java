package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameReturnsNullOnNonMatchedInputTest {

    @Test
    public void parseNameReturnsNullOnNonMatchedInputTest() {
        assertNull(AppVersion.parseName("invalid.text"));
    }

}