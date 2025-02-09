package org.davidmoten.text.utils;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() throws IOException {
        FileReader reader = new FileReader(new File("test.txt"));
        Builder builder = WordWrap.from(reader);
        assertTrue(builder instanceof WordWrap.Builder);
    }

}