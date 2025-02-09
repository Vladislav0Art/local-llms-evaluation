package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        StringBuilder2 stringBuilder = new StringBuilder2("   test");
        WordWrap.leftTrim(stringBuilder);
        assertEquals("test", stringBuilder.toString());
    }

}