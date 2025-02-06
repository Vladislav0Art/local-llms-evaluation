package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_ReturnsExpectedStringRepresentation {

    @Test
    public void toString_ReturnsExpectedStringRepresentation() {
        String amiName = "ami-1234567890";
        assertEquals(amiName, AppVersion.parseName(amiName).toString());
    }

}