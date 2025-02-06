package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidAmarthostname_ThrowsParseException {

    @Test
    public void parseName_InvalidAmarthostname_ThrowsParseException() {
        String amiName = "ami-0c103043abf3aef9f6c5b15d8d42ad46";
        assertThrows(ParseException.class, () -> AppVersion.parseName(amiName));
    }

}