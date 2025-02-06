package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_SimpleTest {

    @Test
    public void toString_SimpleTest() {
        String toString = AppVersion.toString(new AppVersion());
        assertNotNull(toString);
        assertTrue(toString.contains("1.0.0"));
    }

}