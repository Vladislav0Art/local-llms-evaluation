package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_ValidVersionReturnCorrectStringRepresentation {

    @Test
    public void toString_ValidVersionReturnCorrectStringRepresentation() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertEquals("ami-1234 (12,34)", version.toString());
    }

}