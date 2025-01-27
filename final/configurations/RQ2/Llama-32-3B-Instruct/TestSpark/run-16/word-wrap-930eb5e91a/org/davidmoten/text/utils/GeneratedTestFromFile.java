package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFromFile {

    @Test
    public void testFromFile() {
        String input = "Hello World";
        WordWrap.Builder builder = WordWrap.fromFile(input);
        assertNotNull(builder);
    }

}