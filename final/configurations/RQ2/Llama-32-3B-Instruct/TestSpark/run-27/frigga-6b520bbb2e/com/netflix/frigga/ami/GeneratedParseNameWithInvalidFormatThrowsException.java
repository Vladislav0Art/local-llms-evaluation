package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameWithInvalidFormatThrowsException {

    @Test
    public void parseNameWithInvalidFormatThrowsException() {
        assertThrows(Exception.class, () -> AppVersion.parseName("InvalidFormat"));
    }

}