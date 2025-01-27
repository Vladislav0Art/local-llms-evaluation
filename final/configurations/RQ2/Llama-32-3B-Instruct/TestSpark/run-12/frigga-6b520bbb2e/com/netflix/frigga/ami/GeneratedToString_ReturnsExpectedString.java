package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_ReturnsExpectedString {

    @Test
    public void toString_ReturnsExpectedString() {
        String toString = AppVersion.toString();
        assertNotNull(toString);
    }

}