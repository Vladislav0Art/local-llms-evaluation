package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_InvalidAminoIsNotParsed {

    @Test
    public void parseName_InvalidAminoIsNotParsed() {
        String amiName = "InvalidAmino";
        AppVersion result = AppVersion.parseName(amiName);
        assertNull(result);
    }

}