package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedParseNameNullTest {

    @Test
    public void parseNameNullTest() {
        assertNull(AppVersion.parseName(null));
    }

}