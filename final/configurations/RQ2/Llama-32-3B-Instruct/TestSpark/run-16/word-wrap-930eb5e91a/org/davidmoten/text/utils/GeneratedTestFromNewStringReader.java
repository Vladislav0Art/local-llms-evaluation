package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFromNewStringReader {

    @Test
    public void testFromNewStringReader() {
        String input = "Hello World";
        WordWrap.Builder builder = WordWrap.from(new StringReader(input));
        assertNotNull(builder);
    }

}