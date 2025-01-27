package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFromClasspathUtf8 {

    @Test
    public void testFromClasspathUtf8() {
        String input = "Hello World";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(input);
        assertNotNull(builder);
    }

}