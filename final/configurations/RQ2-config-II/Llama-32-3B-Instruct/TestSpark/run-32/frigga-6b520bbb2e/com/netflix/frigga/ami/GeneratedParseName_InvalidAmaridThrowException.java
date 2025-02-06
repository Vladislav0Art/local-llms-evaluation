package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidAmaridThrowException {

    @Test
    public void parseName_InvalidAmaridThrowException() {
        String amiName = "invalid-amid";
        assertThrows(Exception.class, () -> AppVersion.parseName(amiName));
    }

}