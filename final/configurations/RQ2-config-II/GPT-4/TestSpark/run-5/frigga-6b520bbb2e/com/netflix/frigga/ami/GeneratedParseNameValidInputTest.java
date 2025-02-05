package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedParseNameValidInputTest {

    @Test
    public void parseNameValidInputTest() {
        assertNotNull(AppVersion.parseName("app-1.0.0-h0.78cf3b2"));
    }

}