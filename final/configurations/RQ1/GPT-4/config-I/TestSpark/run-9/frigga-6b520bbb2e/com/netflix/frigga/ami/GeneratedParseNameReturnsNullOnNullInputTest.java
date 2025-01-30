package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNameReturnsNullOnNullInputTest {

    @Test
    public void parseNameReturnsNullOnNullInputTest() {
        assertNull(AppVersion.parseName(null));
    }

}