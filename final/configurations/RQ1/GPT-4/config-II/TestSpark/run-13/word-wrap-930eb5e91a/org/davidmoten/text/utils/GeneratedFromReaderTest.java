package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        StringReader reader = new StringReader("test");

        WordWrap.Builder result = WordWrap.from(reader);

        assertNotNull(result);
    }

}