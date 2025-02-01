package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;

import static org.junit.Assert.*;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        BufferedReader reader = new BufferedReader(new StringReader("test"));
        WordWrap.Builder result = WordWrap.from(reader);
        assertNotNull(result);
    }

}