package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedParseNameEmptyInputTest {

    @Test
    public void parseNameEmptyInputTest() {
        assertNull(AppVersion.parseName(""));
    }

}