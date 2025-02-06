package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_ReturnsCorrectStringRepresentation {

    @Test
    public void toString_ReturnsCorrectStringRepresentation() {
        String version = AppVersion.parseName("1.0.2-1234").toString();
        assertNotNull(version);
        assertEquals("version", version);
    }

}