package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedTestPattern {

    @Test
    public void testPattern() {
        String name = "test123-test456-compute";
        Pattern pattern = Pattern.compile(".*-([0-9]+).*(.*)-(.*)");
        Matcher matcher = pattern.matcher(name);
        assertEquals(false, matcher.find());
    }

}