package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class GeneratedTestRightTrim {

    @Test
    public void testRightTrim() throws Exception {
        Reader reader = new ByteArrayInputStream("test test".getBytes(StandardCharsets.UTF_8));
        WordWrap wordWrap = WordWrap.fromClasspath(reader);
        assertEquals("", wordWrap.rightTrim("test test"));
    }

}