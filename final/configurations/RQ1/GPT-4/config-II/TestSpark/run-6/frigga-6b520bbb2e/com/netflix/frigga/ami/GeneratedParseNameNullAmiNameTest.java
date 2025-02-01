package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedParseNameNullAmiNameTest {

    @Test
    public void parseNameNullAmiNameTest() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

}