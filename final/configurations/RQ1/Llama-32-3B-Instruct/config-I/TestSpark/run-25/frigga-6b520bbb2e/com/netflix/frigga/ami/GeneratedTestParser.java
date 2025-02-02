package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedTestParser {

    @Test
    public void testParser() {
        String name = "test123-test456-compute";
        Pattern pattern = Pattern.compile(".*-([0-9]+).*(.*)-(.*)");
        Matcher matcher = pattern.matcher(name);

        assertEquals(4, matcher.groupCount());

        assertEquals("test123", matcher.group(1));
        assertEquals("test456", matcher.group(2));
        assertEquals("compute", matcher.group(3));
    }

}